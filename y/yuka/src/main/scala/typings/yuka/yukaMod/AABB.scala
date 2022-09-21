package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "AABB")
@js.native
/**
  * Constructs a new AABB with the given values.
  *
  * @param [min=Vector(0,0,0)] - The minimum bounds of the AABB.
  * @param [max=Vector(0,0,0)] - The maximum bounds of the AABB.
  */
open class AABB ()
  extends typings.yuka.aabbMod.AABB {
  def this(min: typings.yuka.vector3Mod.Vector3) = this()
  def this(min: Unit, max: typings.yuka.vector3Mod.Vector3) = this()
  def this(min: typings.yuka.vector3Mod.Vector3, max: typings.yuka.vector3Mod.Vector3) = this()
}
