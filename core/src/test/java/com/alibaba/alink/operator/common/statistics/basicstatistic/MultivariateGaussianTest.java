package com.alibaba.alink.operator.common.statistics.basicstatistic;

import com.alibaba.alink.common.linalg.DenseMatrix;
import com.alibaba.alink.common.linalg.DenseVector;
import com.alibaba.alink.testutil.AlinkTestBase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link MultivariateGaussian}.
 */

public class MultivariateGaussianTest extends AlinkTestBase {
	private static final double TOL = 1.0e-5;

	@Test
	public void testUnivariate() throws Exception {
		DenseVector x1 = new DenseVector(new double[] {0.0});
		DenseVector x2 = new DenseVector(new double[] {1.5});
		DenseVector mu = DenseVector.zeros(1);
		DenseMatrix sigma1 = DenseMatrix.ones(1, 1);
		MultivariateGaussian dist1 = new MultivariateGaussian(mu, sigma1);
		Assert.assertEquals(dist1.pdf(x1), 0.39894, TOL);
		Assert.assertEquals(dist1.pdf(x2), 0.12952, TOL);

		DenseMatrix sigma2 = DenseMatrix.ones(1, 1);
		sigma2.scaleEqual(4.0);
		MultivariateGaussian dist2 = new MultivariateGaussian(mu, sigma2);
		Assert.assertEquals(dist2.pdf(x1), 0.19947, TOL);
		Assert.assertEquals(dist2.pdf(x2), 0.15057, TOL);
	}

	@Test
	public void testMultivariate() throws Exception {
		DenseVector mu = DenseVector.zeros(2);

		DenseMatrix sigma1 = DenseMatrix.eye(2);
		MultivariateGaussian mg1 = new MultivariateGaussian(mu, sigma1);
		Assert.assertEquals(mg1.pdf(DenseVector.zeros(2)), 0.15915, TOL);
		Assert.assertEquals(mg1.pdf(DenseVector.ones(2)), 0.05855, TOL);

		DenseMatrix sigma2 = new DenseMatrix(2, 2, new double[] {4.0, -1.0, -1.0, 2.0});
		MultivariateGaussian mg2 = new MultivariateGaussian(mu, sigma2);
		Assert.assertEquals(mg2.pdf(DenseVector.zeros(2)), 0.060155, TOL);
		Assert.assertEquals(mg2.pdf(DenseVector.ones(2)), 0.033971, TOL);
	}

	@Test
	public void testMultivariateDegenerate() throws Exception {
		DenseVector mu = DenseVector.zeros(2);
		DenseMatrix sigma = new DenseMatrix(2, 2, new double[] {1.0, 1.0, 1.0, 1.0});
		MultivariateGaussian mg = new MultivariateGaussian(mu, sigma);
		Assert.assertEquals(mg.pdf(DenseVector.zeros(2)), 0.11254, TOL);
		Assert.assertEquals(mg.pdf(DenseVector.ones(2)), 0.068259, TOL);
	}
}