package typings.yuka

import typings.yuka.matrix3Mod.Matrix3
import typings.yuka.quaternionMod.Quaternion
import typings.yuka.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrix4Mod {
  
  @JSImport("yuka/src/math/Matrix4", "Matrix4")
  @js.native
  /**
    * Constructs a new 4x4 identity matrix.
    */
  open class Matrix4 () extends StObject {
    
    /**
      * Composes a matrix from the given position, quaternion and scale.
      *
      * @param position - A vector representing a position in 3D space.
      * @param rotation - A quaternion representing a rotation.
      * @param scale - A vector representing a 3D scaling.
      * @return A reference to this matrix.
      */
    def compose(position: Vector3, rotation: Quaternion, scale: Vector3): this.type = js.native
    
    /**
      * Copies all values from the given matrix to this matrix.
      *
      * @param m - The matrix to copy.
      */
    def copy(m: Matrix4): this.type = js.native
    
    /**
      * The elements of the matrix in column-major order.
      * @default [1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1]}
      */
    var elements: js.Array[Double] = js.native
    
    /**
      * Returns true if the given matrix is deep equal with this matrix.
      *
      * @param m - The matrix to test.
      * @return The result of the equality test.
      */
    def equals(m: Matrix4): Boolean = js.native
    
    /**
      * Extracts the basis vectors and stores them to the given vectors.
      *
      * @param xAxis - The first result vector for the x-axis.
      * @param yAxis - The second result vector for the y-axis.
      * @param zAxis - The third result vector for the z-axis.
      */
    def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): this.type = js.native
    
    /**
      * Sets the elements of this matrix from an array.
      *
      * @param array - An array.
      * @param offset - An optional offset.
      */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    
    /**
      * Sets the upper-left 3x3 portion of this matrix by the given 3x3 matrix. Other
      * parts of the matrix are equal to the identiy matrix.
      *
      * @param m - A 3x3 matrix.
      */
    def fromMatrix3(m: Matrix3): this.type = js.native
    
    /**
      * Uses the given quaternion to transform the upper left 3x3 part to a rotation matrix.
      * Other parts of the matrix are equal to the identity matrix.
      *
      * @param q - A quaternion representing a rotation.
      */
    def fromQuaternion(q: Quaternion): this.type = js.native
    
    /**
      * Computes the inverse of this matrix and stored the result in the given matrix.
      *
      * You can not invert a matrix with a determinant of zero. If you attempt this, the method returns a zero matrix instead.
      *
      * @param m - The result matrix.
      * @return The result matrix.
      */
    def getInverse(m: Matrix4): Matrix4 = js.native
    
    /**
      * Computes the maximum scale value for all three axis.
      *
      * @return The maximum scale value.
      */
    def getMaxScale(): Double = js.native
    
    /**
      * Transforms this matrix to an identity matrix.
      */
    def identity(): this.type = js.native
    
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
    def multiply(m: Matrix4): this.type = js.native
    
    /**
      * Multiplies two given matrices and stores the result in this matrix.
      *
      * @param a - The first matrix of the operation.
      * @param b - The second matrix of the operation.
      */
    def multiplyMatrices(a: Matrix4, b: Matrix4): this.type = js.native
    
    /**
      * Multiplies the given scalar with this matrix.
      *
      * @param s - The scalar to multiply.
      */
    def multiplyScalar(s: Double): this.type = js.native
    
    /**
      * Multiplies this matrix with the given matrix.
      * So the order of the multiplication is switched compared to {@link Matrix4#multiply}.
      *
      * @param m - The matrix to multiply.
      */
    def premultiply(m: Matrix4): this.type = js.native
    
    /**
      * Scales this matrix by the given 3D vector.
      *
      * @param v - A 3D vector representing a scaling.
      */
    def scale(v: Vector3): this.type = js.native
    
    /**
      * Sets the given values to this matrix. The arguments are in row-major order.
      *
      * @param n11 - An element of the matrix.
      * @param n12 - An element of the matrix.
      * @param n13 - An element of the matrix.
      * @param n14 - An element of the matrix.
      * @param n21 - An element of the matrix.
      * @param n22 - An element of the matrix.
      * @param n23 - An element of the matrix.
      * @param n24 - An element of the matrix.
      * @param n31 - An element of the matrix.
      * @param n32 - An element of the matrix.
      * @param n33 - An element of the matrix.
      * @param n34 - An element of the matrix.
      * @param n41 - An element of the matrix.
      * @param n42 - An element of the matrix.
      * @param n43 - An element of the matrix.
      * @param n44 - An element of the matrix.
      */
    // prettier-ignore
    def set(
      n11: Double,
      n12: Double,
      n13: Double,
      n14: Double,
      n21: Double,
      n22: Double,
      n23: Double,
      n24: Double,
      n31: Double,
      n32: Double,
      n33: Double,
      n34: Double,
      n41: Double,
      n42: Double,
      n43: Double,
      n44: Double
    ): this.type = js.native
    
    /**
      * Sets the translation part of the 4x4 matrix to the given position vector.
      *
      * @param v - A 3D vector representing a position.
      */
    def setPosition(v: Vector3): this.type = js.native
    
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
