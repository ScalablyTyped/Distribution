package typings.yuka

import typings.yuka.anon.X
import typings.yuka.srcMathMatrix3Mod.Matrix3
import typings.yuka.srcMathMatrix4Mod.Matrix4
import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathQuaternionMod {
  
  @JSImport("yuka/src/math/Quaternion", "Quaternion")
  @js.native
  /**
    * Constructs a new quaternion with the given values.
    *
    * @param [x=0] - The x component.
    * @param [y=0] - The y component.
    * @param [z=0] - The z component.
    * @param [w=0] - The w component.
    */
  open class Quaternion () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: Unit, w: Double) = this()
    def this(x: Double, y: Unit, z: Double, w: Double) = this()
    def this(x: Double, y: Unit, z: Unit, w: Double) = this()
    def this(x: Unit, y: Double, z: Double, w: Double) = this()
    def this(x: Unit, y: Double, z: Unit, w: Double) = this()
    def this(x: Unit, y: Unit, z: Double, w: Double) = this()
    def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
    
    /**
      * Computes the shortest angle between two rotation defined by this quaternion and the given one.
      *
      * @param q - The given quaternion.
      * @return The angle in radians.
      */
    def angleTo(q: Quaternion): Double = js.native
    
    /**
      * Computes the conjugate of this quaternion.
      */
    def conjugate(): this.type = js.native
    
    /**
      * Copies all values from the given quaternion to this quaternion.
      *
      * @param q - The quaternion to copy.
      */
    def copy(q: Quaternion): this.type = js.native
    
    /**
      * Computes the dot product of this and the given quaternion.
      *
      * @param q - The given quaternion.
      */
    def dot(q: Quaternion): this.type = js.native
    
    /**
      * Returns true if the given quaternion is deep equal with this quaternion.
      *
      * @param q - The quaternion to test.
      * @return The result of the equality test.
      */
    def equals(q: Quaternion): Boolean = js.native
    
    /**
      * Extracts the rotation of the given 4x4 matrix and stores it in this quaternion.
      *
      * @param m - A 4x4 matrix.
      * @return A reference to this quaternion.
      */
    def extractRotationFromMatrix(m: Matrix4): this.type = js.native
    
    /**
      * Sets the components of this quaternion from an array.
      *
      * @param array - An array.
      * @param offset - An optional offset.
      */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    
    /**
      * Sets the components of this quaternion from the given euler angle (YXZ order).
      *
      * @param x - Rotation around x axis in radians.
      * @param y - Rotation around y axis in radians.
      * @param z - Rotation around z axis in radians.
      * @return A reference to this quaternion.
      */
    def fromEuler(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Sets the components of this quaternion from the given 3x3 rotation matrix.
      *
      * @param m - The rotation matrix.
      */
    def fromMatrix3(m: Matrix3): this.type = js.native
    
    /**
      * Computes the inverse of this quaternion.
      */
    def inverse(): this.type = js.native
    
    /**
      * Computes the length of this quaternion.
      *
      * @return The length of this quaternion.
      */
    def length(): Double = js.native
    
    /**
      * Creates a quaternion that orients an object to face towards a specified target direction.
      *
      * @param localForward - Specifies the forward direction in the local space of the object.
      * @param targetDirection - Specifies the desired world space direction the object should look at.
      * @param localUp - Specifies the up direction in the local space of the object.
      */
    def lookAt(localForward: Vector3, targetDirection: Vector3, localUp: Vector3): this.type = js.native
    
    /**
      * Multiplies this quaternion with the given quaternion.
      *
      * @param q - The quaternion to multiply.
      */
    def multiply(q: Quaternion): this.type = js.native
    
    /**
      * Multiplies two given quaternions and stores the result in this quaternion.
      *
      * @param a - The first quaternion of the operation.
      * @param b - The second quaternion of the operation.
      */
    def multiplyQuaternions(a: Quaternion, b: Quaternion): this.type = js.native
    
    /**
      * Normalizes this quaternion.
      */
    def normalize(): this.type = js.native
    
    /**
      * Multiplies the given quaternion with this quaternion.
      * So the order of the multiplication is switched compared to {@link Quaternion#multiply}.
      *
      * @param q - The quaternion to multiply.
      */
    def premultiply(q: Quaternion): this.type = js.native
    
    /**
      * Transforms this rotation defined by this quaternion towards the target rotation
      * defined by the given quaternion by the given angular step. The rotation will not overshoot.
      *
      * @param q - The target rotation.
      * @param step - The maximum step in radians.
      * @param tolerance - A tolerance value in radians to tweak the result when both rotations are considered to be equal.
      * @return Whether the given quaternion already represents the target rotation.
      */
    def rotateTo(q: Quaternion, step: Double): Boolean = js.native
    def rotateTo(q: Quaternion, step: Double, tolerance: Double): Boolean = js.native
    
    /**
      * Sets the given values to this quaternion.
      *
      * @param x - The x component.
      * @param y - The y component.
      * @param z - The z component.
      * @param w - The w component.
      */
    def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Spherically interpolates between this quaternion and the given quaternion by t.
      * The parameter t is clamped to the range [0, 1].
      *
      * @param q - The target rotation.
      * @param t - The interpolation parameter.
      * @return A reference to this quaternion.
      */
    def slerp(q: Quaternion, t: Double): this.type = js.native
    
    /**
      * Computes the squared length of this quaternion.
      *
      * @return The squared length of this quaternion.
      */
    def squaredLength(): Double = js.native
    
    /**
      * Copies all values of this quaternion to the given array.
      *
      * @param array - An array.
      * @param offset - An optional offset.
      * @return The array with the quaternion components.
      */
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    
    /**
      * Returns an euler angle (YXZ order) representation of this quaternion.
      *
      * @param euler - The resulting euler angles.
      * @return The resulting euler angles.
      */
    def toEuler(euler: X): X = js.native
    
    /**
      * The w component.
      */
    var w: Double = js.native
    
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
