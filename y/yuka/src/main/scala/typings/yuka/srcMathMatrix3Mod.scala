package typings.yuka

import typings.yuka.anon.Diagonal
import typings.yuka.srcMathMatrix4Mod.Matrix4
import typings.yuka.srcMathQuaternionMod.Quaternion
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathMatrix3Mod {
  
  @JSImport("yuka/src/math/Matrix3", "Matrix3")
  @js.native
  /**
    * Constructs a new 3x3 identity matrix.
    */
  open class Matrix3 () extends StObject {
    
    /**
      * Copies all values from the given matrix to this matrix.
      *
      * @param m - The matrix to copy.
      */
    def copy(m: Matrix3): this.type = js.native
    
    /**
      * Computes the eigenvectors and eigenvalues.
      *
      * Reference: https://github.com/AnalyticalGraphicsInc/cesium/blob/411a1afbd36b72df64d7362de6aa934730447234/Source/Core/Matrix3.js#L1141 (Apache License 2.0)
      *
      * The values along the diagonal of the diagonal matrix are the eigenvalues.
      * The columns of the unitary matrix are the corresponding eigenvectors.
      *
      * @param result - An object with unitary and diagonal properties which are matrices onto which to store the result.
      * @return An object with unitary and diagonal properties which are matrices onto which to store the result.
      */
    def eigenDecomposition(result: Diagonal): Diagonal = js.native
    
    /**
      * The elements of the matrix in column-major order.
      * @default [1, 0, 0, 0, 1, 0, 0, 0, 1]}
      */
    var elements: js.Array[Double] = js.native
    
    /**
      * Returns true if the given matrix is deep equal with this matrix.
      *
      * @param m - The matrix to test.
      * @return The result of the equality test.
      */
    def equals(m: Matrix3): Boolean = js.native
    
    /**
      * Extracts the basis vectors and stores them to the given vectors.
      *
      * @param xAxis - The first result vector for the x-axis.
      * @param yAxis - The second result vector for the y-axis.
      * @param zAxis - The third result vector for the z-axis.
      */
    def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): this.type = js.native
    
    /**
      * Computes the frobenius norm. It's the square root of the sum of all squared matrix elements.
      *
      * @return The frobenius norm.
      */
    def frobeniusNorm(): Double = js.native
    
    /**
      * Sets the elements of this matrix from an array.
      *
      * @param array - An array.
      * @param offset - An optional offset.
      */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    
    /**
      * Sets the elements of this matrix by extracting the upper-left 3x3 portion
      * from a 4x4 matrix.
      *
      * @param m - A 4x4 matrix.
      */
    def fromMatrix4(m: Matrix4): this.type = js.native
    
    /**
      * Creates a rotation matrix from the given quaternion.
      *
      * @param q - A quaternion representing a rotation.
      */
    def fromQuaternion(q: Quaternion): this.type = js.native
    
    /**
      * Computes the element index according to the given column and row.
      *
      * @param column - Index of the column.
      * @param row - Index of the row.
      * @return The index of the element at the provided row and column.
      */
    def getElementIndex(column: Double, row: Double): Double = js.native
    
    /**
      * Transforms this matrix to an identity matrix.
      */
    def identity(): this.type = js.native
    
    /**
      * Creates a rotation matrix that orients an object to face towards a specified target direction.
      *
      * @param localForward - Specifies the forward direction in the local space of the object.
      * @param targetDirection - Specifies the desired world space direction the object should look at.
      * @param localUp - Specifies the up direction in the local space of the object.
      */
    def lookAt(localForward: Vector3, targetDirection: Vector3, localUp: Vector3): this.type = js.native
    
    /**
      * Makes a basis from the given vectors.
      *
      * @param xAxis - The first basis vector for the x-axis.
      * @param yAxis - The second basis vector for the y-axis.
      * @param zAxis - The third basis vector for the z-axis.
      */
    def makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): this.type = js.native
    
    /**
      * Multiplies this matrix with the given matrix.
      *
      * @param m - The matrix to multiply.
      */
    def multiply(m: Matrix3): this.type = js.native
    
    /**
      * Multiplies two given matrices and stores the result in this matrix.
      *
      * @param a - The first matrix of the operation.
      * @param b - The second matrix of the operation.
      */
    def multiplyMatrices(a: Matrix3, b: Matrix3): this.type = js.native
    
    /**
      * Multiplies the given scalar with this matrix.
      *
      * @param s - The scalar to multiply.
      */
    def multiplyScalar(s: Double): this.type = js.native
    
    /**
      * Computes the  "off-diagonal" frobenius norm. Assumes the matrix is symmetric.
      *
      * @return The "off-diagonal" frobenius norm.
      */
    def offDiagonalFrobeniusNorm(): Double = js.native
    
    /**
      * Multiplies this matrix with the given matrix.
      * So the order of the multiplication is switched compared to {@link Matrix3#multiply}.
      *
      * @param m - The matrix to multiply.
      */
    def premultiply(m: Matrix3): this.type = js.native
    
    /**
      * Sets the given values to this matrix. The arguments are in row-major order.
      *
      * @param n11 - An element of the matrix.
      * @param n12 - An element of the matrix.
      * @param n13 - An element of the matrix.
      * @param n21 - An element of the matrix.
      * @param n22 - An element of the matrix.
      * @param n23 - An element of the matrix.
      * @param n31 - An element of the matrix.
      * @param n32 - An element of the matrix.
      * @param n33 - An element of the matrix.
      */
    // prettier-ignore
    def set(
      n11: Double,
      n12: Double,
      n13: Double,
      n21: Double,
      n22: Double,
      n23: Double,
      n31: Double,
      n32: Double,
      n33: Double
    ): this.type = js.native
    
    /**
      * Finds the largest off-diagonal term and then creates a matrix
      * which can be used to help reduce it.
      *
      * @param result - The result matrix.
      * @return The result matrix.
      */
    def shurDecomposition(result: Matrix3): Matrix3 = js.native
    
    /**
      * Copies all elements of this matrix to the given array.
      *
      * @param array - An array.
      * @param offset - An optional offset.
      * @return The array with the elements of the matrix.
      */
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    
    /**
      * Transposes this matrix.
      */
    def transpose(): this.type = js.native
  }
}
