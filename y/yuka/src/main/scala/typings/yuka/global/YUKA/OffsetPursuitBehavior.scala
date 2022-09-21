package typings.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.OffsetPursuitBehavior")
@js.native
/**
  * Constructs a new offset pursuit behavior.
  *
  * @param [leader] - The leader vehicle.
  * @param [offset] - The offset from the leader.
  */
open class OffsetPursuitBehavior ()
  extends typings.yuka.mod.OffsetPursuitBehavior {
  def this(leader: typings.yuka.vehicleMod.Vehicle) = this()
  def this(leader: Unit, offset: typings.yuka.vector3Mod.Vector3) = this()
  def this(leader: typings.yuka.vehicleMod.Vehicle, offset: typings.yuka.vector3Mod.Vector3) = this()
}
