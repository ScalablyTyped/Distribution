package typings.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "OffsetPursuitBehavior")
@js.native
/**
  * Constructs a new offset pursuit behavior.
  *
  * @param [leader] - The leader vehicle.
  * @param [offset] - The offset from the leader.
  */
open class OffsetPursuitBehavior ()
  extends typings.yuka.srcYukaMod.OffsetPursuitBehavior {
  def this(leader: typings.yuka.srcSteeringVehicleMod.Vehicle) = this()
  def this(leader: Unit, offset: typings.yuka.srcMathVector3Mod.Vector3) = this()
  def this(leader: typings.yuka.srcSteeringVehicleMod.Vehicle, offset: typings.yuka.srcMathVector3Mod.Vector3) = this()
}
