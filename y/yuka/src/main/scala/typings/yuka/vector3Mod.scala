package typings.yuka

import typings.yuka.matrix3Mod.Matrix3
import typings.yuka.matrix4Mod.Matrix4
import typings.yuka.quaternionMod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vector3Mod {
  
  @JSImport("yuka/src/math/Vector3", "Vector3")
  @js.native
  /**
    * Constructs a new 3D vector with the given values.
    *
    * @param [x=0] - The x component.
    * @param [y=0] - The y component.
    * @param [z=0] - The z component.
    */
  open class Vector3 () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    
    /**
      * Adds the given 3D vector to this 3D vector.
      *
      * @param v - The vector to add.
      */
    def add(v: Vector3): this.type = js.native
    
    /**
      * Adds the given scalar to this 3D vector.
      *
      * @param s - The scalar to add.
      */
    def addScalar(s: Double): this.type = js.native
    
    /**
      * Adds two given 3D vectors and stores the result in this 3D vector.
      *
      * @param a - The first vector of the operation.
      * @param b - The second vector of the operation.
      */
    def addVectors(a: Vector3, b: Vector3): this.type = js.native
    
    /**
      * Computes the angle between this and the given vector.
      *
      * @param v - A 3D vector.
      * @return The angle in radians.
      */
    def angleTo(v: Vector3): Double = js.native
    
    /**
      * Multiplies the given 4x4 matrix with this 3D vector
      *
      * @param m - A 4x4 matrix.
      */
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    /**
      * Multiplies the given quaternion with this 3D vector.
      *
      * @param q - A quaternion.
      */
    def applyRotation(q: Quaternion): this.type = js.native
    
    /**
      * Ensures this 3D vector lies in the given min/max range.
      *
      * @param min - The min range.
      * @param max - The max range.
      */
    def clamp(min: Vector3, max: Vector3): this.type = js.native
    
    /**
      * Copies all values from the given 3D vector to this 3D vector.
      *
      * @param v - The vector to copy.
      */
    def copy(v: Vector3): this.type = js.native
    
    /**
      * Computes the cross product of this and the given 3D vector and
      * stores the result in this 3D vector.
      *
      * @param v - A 3D vector.
      */
    def cross(v: Vector3): this.type = js.native
    
    /**
      * Computes the cross product of the two given 3D vectors and
      * stores the result in this 3D vector.
      *
      * @param a - The first 3D vector.
      * @param b - The second 3D vector.
      */
    def crossVectors(a: Vector3, b: Vector3): this.type = js.native
    
    /**
      * Computes the euclidean distance between this 3D vector and the given one.
      *
      * @param v - A 3D vector.
      * @return The euclidean distance between two 3D vectors.
      */
    def distanceTo(v: Vector3): Double = js.native
    
    /**
      * Divides the given 3D vector through this 3D vector.
      *
      * @param v - The vector to divide.
      */
    def divide(v: Vector3): this.type = js.native
    
    /**
      * Divides the given scalar through this 3D vector.
      *
      * @param s - The scalar to multiply.
      */
    def divideScalar(s: Double): this.type = js.native
    
    /**
      * Divides two given 3D vectors and stores the result in this 3D vector.
      *
      * @param a - The first vector of the operation.
      * @param b - The second vector of the operation.
      */
    def divideVectors(a: Vector3, b: Vector3): this.type = js.native
    
    /**
      * Computes the dot product of this and the given 3D vector.
      *
      * @param v - The given 3D vector.
      * @return The results of the dot product.
      */
    def dot(v: Vector3): Double = js.native
    
    /**
      * Returns true if the given 3D vector is deep equal with this 3D vector.
      *
      * @param v - The 3D vector to test.
      * @return The result of the equality test.
      */
    def equals(v: Vector3): Boolean = js.native
    
    /**
      * Extracts the position portion of the given 4x4 matrix and stores it in this 3D vector.
      *
      * @param m - A 4x4 matrix.
      */
    def extractPositionFromMatrix(m: Matrix4): this.type = js.native
    
    /**
      * Sets the components of this 3D vector from an array.
      *
      * @param array - An array.
      * @param offset - An optional offset.
      */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    
    /**
      * Sets the components of this 3D vector from a column of a 3x3 matrix.
      *
      * @param m - A 3x3 matrix.
      * @param i - The index of the column.
      */
    def fromMatrix3Column(m: Matrix3, i: Double): this.type = js.native
    
    /**
      * Sets the components of this 3D vector from a column of a 4x4 matrix.
      *
      * @param m - A 4x4 matrix.
      * @param i - The index of the column.
      */
    def fromMatrix4Column(m: Matrix3, i: Double): this.type = js.native
    
    /**
      * Sets the components of this 3D vector from a spherical coordinate.
      *
      * @param radius - The radius.
      * @param phi - The polar or inclination angle in radians. Should be in the range of (−π/2, +π/2].
      * @param theta - The azimuthal angle in radians. Should be in the range of (−π, +π].
      */
    def fromSpherical(radius: Double, phi: Double, theta: Double): this.type = js.native
    
    /**
      * Computes the length of this 3D vector.
      *
      * @return The length of this 3D vector.
      */
    def length(): Double = js.native
    
    /**
      * Computes the manhattan distance between this 3D vector and the given one.
      *
      * @param v - A 3D vector.
      * @return The manhattan distance between two 3D vectors.
      */
    def manhattanDistanceTo(v: Vector3): Double = js.native
    
    /**
      * Computes the manhattan length of this 3D vector.
      *
      * @return The manhattan length of this 3D vector.
      */
    def manhattanLength(): Double = js.native
    
    /**
      * Compares each vector component of this 3D vector and the
      * given one and stores the maximum value in this instance.
      *
      * @param v - The 3D vector to check.
      */
    def max(v: Vector3): this.type = js.native
    
    /**
      * Compares each vector component of this 3D vector and the
      * given one and stores the minimum value in this instance.
      *
      * @param v - The 3D vector to check.
      */
    def min(v: Vector3): this.type = js.native
    
    /**
      * Multiplies the given 3D vector with this 3D vector.
      *
      * @param v - The vector to multiply.
      */
    def multiply(v: Vector3): this.type = js.native
    
    /**
      * Multiplies the given scalar with this 3D vector.
      *
      * @param s - The scalar to multiply.
      */
    def multiplyScalar(s: Double): this.type = js.native
    
    /**
      * Multiplies two given 3D vectors and stores the result in this 3D vector.
      *
      * @param a - The first vector of the operation.
      * @param b - The second vector of the operation.
      */
    def multiplyVectors(a: Vector3, b: Vector3): this.type = js.native
    
    /**
      * Normalizes this 3D vector.
      */
    def normalize(): this.type = js.native
    
    /**
      * Reflects this vector along the given normal.
      *
      * @param normal - The normal vector.
      */
    def reflect(normal: Vector3): this.type = js.native
    
    /**
      * Sets the given values to this 3D vector.
      *
      * @param x - The x component.
      * @param y - The y component.
      * @param z - The z component.
      */
    def set(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Computes the squared euclidean distance between this 3D vector and the given one.
      * Calling this method is faster than calling {@link Vector3#distanceTo},
      * since it avoids computing a square root.
      *
      * @param v - A 3D vector.
      * @return The squared euclidean distance between two 3D vectors.
      */
    def squaredDistanceTo(v: Vector3): Double = js.native
    
    /**
      * Computes the squared length of this 3D vector.
      * Calling this method is faster than calling {@link Vector3#length},
      * since it avoids computing a square root.
      *
      * @return The squared length of this 3D vector.
      */
    def squaredLength(): Double = js.native
    
    /**
      * Subtracts the given 3D vector from this 3D vector.
      *
      * @param v - The vector to subtract.
      */
    def sub(v: Vector3): this.type = js.native
    
    /**
      * Subtracts the given scalar from this 3D vector.
      *
      * @param s - The scalar to subtract.
      */
    def subScalar(s: Double): this.type = js.native
    
    /**
      * Subtracts two given 3D vectors and stores the result in this 3D vector.
      *
      * @param a - The first vector of the operation.
      * @param b - The second vector of the operation.
      */
    def subVectors(a: Vector3, b: Vector3): this.type = js.native
    
    /**
      * Copies all values of this 3D vector to the given array.
      *
      * @param array - An array.
      * @param offset - An optional offset.
      * @return number[] The array with the 3D vector components.
      */
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    
    /**
      * Transform this direction vector by the given 4x4 matrix.
      *
      * @param m - A 4x4 matrix.
      */
    def transformDirection(m: Matrix4): this.type = js.native
    
    /**
      * The x component.
      */
    var x: Double = js.native
    
    /**
      * The y component.
      */
    var y: Double = js.native
    
    /**
      * The z component.
      */
    var z: Double = js.native
  }
}
