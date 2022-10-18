package typings.yuka.srcYukaMod

import typings.yuka.srcGoalGoalMod.StatusTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "Goal")
@js.native
open class Goal[T /* <: typings.yuka.srcCoreGameEntityMod.GameEntity */] ()
  extends typings.yuka.srcGoalGoalMod.Goal[T] {
  def this(owner: T) = this()
}
/* static members */
object Goal {
  
  @JSImport("yuka/src/Yuka", "Goal.STATUS")
  @js.native
  val STATUS: StatusTypes = js.native
}
