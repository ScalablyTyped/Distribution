package typings.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "FollowPathBehavior")
@js.native
/**
  * Constructs a new follow path behavior.
  *
  * @param [path] - The path to follow.
  * @param [nextWaypointDistance] - The distance the agent seeks for the next waypoint.
  */
open class FollowPathBehavior ()
  extends typings.yuka.srcYukaMod.FollowPathBehavior {
  def this(path: typings.yuka.srcSteeringPathMod.Path) = this()
  def this(path: Unit, nextWaypointDistance: Double) = this()
  def this(path: typings.yuka.srcSteeringPathMod.Path, nextWaypointDistance: Double) = this()
}
