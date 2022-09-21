package typings.yuka.yukaMod

import typings.yuka.goalMod.StatusTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "Goal")
@js.native
open class Goal[T /* <: typings.yuka.gameEntityMod.GameEntity */] ()
  extends typings.yuka.goalMod.Goal[T] {
  def this(owner: T) = this()
}
/* static members */
object Goal {
  
  @JSImport("yuka/src/Yuka", "Goal.STATUS")
  @js.native
  val STATUS: StatusTypes = js.native
}
