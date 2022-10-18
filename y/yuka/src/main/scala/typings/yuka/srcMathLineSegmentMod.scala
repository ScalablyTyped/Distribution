package typings.yuka

import typings.yuka.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathLineSegmentMod {
  
  @JSImport("yuka/src/math/LineSegment", "LineSegment")
  @js.native
  /**
    * Constructs a new line segment with the given values.
    *
    * @param [from=Vector3(0,0,0)] - The start point of the line segment.
    * @param [to=Vector3(0,0,0)] - The end point of the line segment.
    */
  open class LineSegment () extends StObject {
    def this(from: Vector3) = this()
    def this(from: Unit, to: Vector3) = this()
    def this(from: Vector3, to: Vector3) = this()
    
    /**
      * Computes a position on the line segment according to the given t value
      * and stores the result in the given 3D vector. The t value has usually a range of
      * [0, 1] where 0 means start position and 1 the end position.
      *
      * @param t - A scalar value representing a position on the line segment.
      * @param result - The result vector.
      * @return The result vector.
      */
    def at(t: Double, result: Vector3): Vector3 = js.native
    
    /**
      * Computes the closest point on an infinite line defined by the line segment.
      * It's possible to clamp the closest point so it does not exceed the start and
      * end position of the line segment.
      *
      * @param point - A point in 3D space.
      * @param clampToLine - Indicates if the results should be clamped.
      * @param result - The result vector.
      * @return The closest point.
      */
    def closestPointToPoint(point: Vector3, clampToLine: Boolean, result: Vector3): Vector3 = js.native
    
    /**
      * Computes a scalar value which represents the closest point on an infinite line
      * defined by the line segment. It's possible to clamp this value so it does not
      * exceed the start and end position of the line segment.
      *
      * @param point - A point in 3D space.
      * @param clampToLine - Indicates if the results should be clamped.
      * @return A scalar representing the closest point.
      */
    def closestPointToPointParameter(point: Vector3): Double = js.native
    def closestPointToPointParameter(point: Vector3, clampToLine: Boolean): Double = js.native
    
    /**
      * Copies all values from the given line segment to this line segment.
      *
      * @param lineSegment - The line segment to copy.
      */
    def copy(lineSegment: LineSegment): this.type = js.native
    
    /**
      * Computes the difference vector between the end and start point of this
      * line segment and stores the result in the given vector.
      *
      * @param result - The result vector.
      * @return The result vector.
      */
    def delta(result: Vector3): Vector3 = js.native
    
    /**
      * Returns true if the given line segment is deep equal with this line segment.
      *
      * @param lineSegment - The line segment to test.
      * @return The result of the equality test.
      */
    def equals(lineSegment: LineSegment): Boolean = js.native
    
    /**
      * The start point of the line segment.
      */
    var from: Vector3 = js.native
    
    /**
      * Sets the given values to this line segment.
      *
      * @param from - The start point of the line segment.
      * @param to - The end point of the line segment.
      * @return A reference to this line segment.
      */
    def set(from: Vector3, to: Vector3): this.type = js.native
    
    /**
      * The end point of the line segment.
      */
    var to: Vector3 = js.native
  }
}
