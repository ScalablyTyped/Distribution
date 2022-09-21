package typings.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.BoundingSphere")
@js.native
/**
  * Constructs a new bounding sphere with the given values.
  *
  * @param [center=Vector(0,0,0)] - The center position of the bounding sphere.
  * @param [radius=0] - The radius of the bounding sphere.
  */
open class BoundingSphere ()
  extends typings.yuka.mod.BoundingSphere {
  def this(center: typings.yuka.vector3Mod.Vector3) = this()
  def this(center: Unit, radius: Double) = this()
  def this(center: typings.yuka.vector3Mod.Vector3, radius: Double) = this()
}
