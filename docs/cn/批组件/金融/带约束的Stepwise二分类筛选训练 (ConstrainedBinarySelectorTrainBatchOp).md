# 带约束的Stepwise二分类筛选训练 (ConstrainedBinarySelectorTrainBatchOp)
Java 类名：com.alibaba.alink.operator.batch.finance.ConstrainedBinarySelectorTrainBatchOp

Python 类名：ConstrainedBinarySelectorTrainBatchOp


## 功能介绍

使用带约束的Stepwise二分类方法，进行特征筛选。

## 参数说明

| 名称 | 中文名称 | 描述 | 类型 | 是否必须？ | 取值范围 | 默认值 |
| --- | --- | --- | --- | --- | --- | --- |
| labelCol | 标签列名 | 输入表中的标签列名 | String | ✓ |  |  |
| alphaEntry | 筛选阈值 | 筛选阈值 | Double |  |  | 0.05 |
| alphaStay | 移除阈值 | 移除阈值 | Double |  |  | 0.05 |
| forceSelectedCols | 强制选择的列 | 强制选择的列 | int[] |  | 所选列类型为 [BIGDECIMAL, BIGINTEGER, BYTE, DOUBLE, FLOAT, INTEGER, LONG, SHORT] |  |
| l1 | L1 正则化系数 | L1 正则化系数，默认为0。 | Double |  | x >= 0.0 | 0.0 |
| l2 | L2 正则化系数 | L2 正则化系数，默认为0。 | Double |  | x >= 0.0 | 0.0 |
| method | 方法 | 方法 | String |  | "ScoreTest", "MarginalContribution" | "ScoreTest" |
| optimMethod | 优化方法 | 优化方法 | String |  | "SQP", "BARRIER" | "SQP" |
| selectedCol | 计算列对应的列名 | 计算列对应的列名, 默认值是null | String |  |  | null |
| selectedCols | 选中的列名数组 | 计算列对应的列名列表 | String[] |  | 所选列类型为 [BIGDECIMAL, BIGINTEGER, BYTE, DOUBLE, FLOAT, INTEGER, LONG, SHORT] | null |




## 代码示例
### Python 代码
```python
from pyalink.alink import *

import pandas as pd

useLocalEnv(1)

df = pd.DataFrame([
    ["$3$0:1.0 1:7.0 2:9.0", "1.0 7.0 9.0", 1.0, 7.0, 9.0, 1.0],
    ["$3$0:1.0 1:3.0 2:3.0", "2.0 3.0 3.0", 2.0, 3.0, 3.0, 1.0],
    ["$3$0:1.0 1:2.0 2:4.0", "3.0 2.0 4.0", 3.0, 2.0, 4.0, 0.0],
    ["$3$0:1.0 1:3.0 2:4.0", "2.0 3.0 4.0", 2.0, 3.0, 4.0, 0.0],
    ["$3$0:1.0 1:3.0 2:4.0", "1.0 5.0 8.0", 1.0, 5.0, 8.0, 0.0],
    ["$3$0:1.0 1:3.0 2:4.0", "1.0 6.0 3.0", 1.0, 6.0, 3.0, 0.0]
])

batchData = BatchOperator.fromDataframe(df, schemaStr='svec string, vec string, f0 double, f1 double, f2 double, label double')

selector = ConstrainedBinarySelectorTrainBatchOp()\
                .setAlphaEntry(0.65)\
                .setAlphaStay(0.7)\
                .setSelectedCol("vec")\
                .setLabelCol("label")\
                .setForceSelectedCols([1,2])

constraint = pd.DataFrame([
    ['{"featureConstraint":[],"constraintBetweenFeatures":{"name":"constraintBetweenFeatures","UP":[],"LO":[],"=":[[1,1.814],[2,0.4]],"%":[],"<":[],">":[[1,3]]},"countZero":null,"elseNullSave":null}']
])
constraintData = BatchOperator.fromDataframe(constraint, schemaStr='data string')

selector.linkFrom(batchData, constraintData)

predict = ConstrainedBinarySelectorPredictBatchOp()\
            .setPredictionCol("pred")\
            .setReservedCols(["label"])

predict.linkFrom(selector, batchData).print()
```

### 运行结果

```
   label     pred
0    1.0  7.0 9.0
1    1.0  3.0 3.0
2    0.0  2.0 4.0
3    0.0  3.0 4.0
4    0.0  5.0 8.0
5    0.0  6.0 3.0
```



