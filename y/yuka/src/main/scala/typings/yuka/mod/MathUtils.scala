package typings.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "MathUtils")
@js.native
open class MathUtils ()
  extends typings.yuka.yukaMod.MathUtils
/* static members */
object MathUtils {
  
  @JSImport("yuka", "MathUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes the signed area of a rectangle defined by three points.
    * This method can also be used to calculate the area of a triangle.
    *
    * @param a - The first point in 3D space.
    * @param b - The second point in 3D space.
    * @param c - The third point in 3D space.
    * @return The signed area.
    */
  inline def area(
    a: typings.yuka.vector3Mod.Vector3,
    b: typings.yuka.vector3Mod.Vector3,
    c: typings.yuka.vector3Mod.Vector3
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the indices of the maximum values of the given array.
    *
    * @param array - The input array.
    * @return Array of indices into the array.
    */
  inline def argmax(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("argmax")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Returns a random sample from a given array.
    *
    * @param array - The array that is used to generate the random sample.
    * @param probabilities - The probabilities associated with each entry. If not given, the sample assumes a uniform distribution over all entries.
    * @return The random sample value.
    */
  inline def choice[T](array: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def choice[T](array: js.Array[T], probabilities: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("choice")(array.asInstanceOf[js.Any], probabilities.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Ensures the given scalar value is within a given min/max range.
    *
    * @param value - The value to clamp.
    * @param min - The min value.
    * @param max - The max value.
    * @return The clamped value.
    */
  inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Computes a RFC4122 Version 4 complied Universally Unique Identifier (UUID).
    *
    * @return The UUID.
    */
  inline def generateUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUUID")().asInstanceOf[String]
  
  /**
    * Computes a random float value within a given min/max range.
    *
    * @param min - The min value.
    * @param max - The max value.
    * @return The random float value.
    */
  inline def randFloat(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randFloat")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Computes a random integer value within a given min/max range.
    *
    * @param min - The min value.
    * @param max - The max value.
    * @return The random integer value.
    */
  inline def randInt(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
