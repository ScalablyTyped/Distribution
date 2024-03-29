package typings.yuka.mod

import typings.yuka.srcGoalGoalMod.StatusTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "Goal")
@js.native
open class Goal[T /* <: typings.yuka.srcCoreGameEntityMod.GameEntity */] ()
  extends typings.yuka.srcYukaMod.Goal[T] {
  def this(owner: T) = this()
}
/* static members */
object Goal {
  
  @JSImport("yuka", "Goal.STATUS")
  @js.native
  val STATUS: StatusTypes = js.native
}
