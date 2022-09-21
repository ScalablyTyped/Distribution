package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "Ray")
@js.native
/**
  * Constructs a new ray with the given values.
  *
  * @param [origin=Vector3(0,0,0)] - The origin of the ray.
  * @param [direction=Vector3(0,0,0)] - The direction of the ray.
  */
open class Ray ()
  extends typings.yuka.rayMod.Ray {
  def this(origin: typings.yuka.vector3Mod.Vector3) = this()
  def this(origin: Unit, direction: typings.yuka.vector3Mod.Vector3) = this()
  def this(origin: typings.yuka.vector3Mod.Vector3, direction: typings.yuka.vector3Mod.Vector3) = this()
}
