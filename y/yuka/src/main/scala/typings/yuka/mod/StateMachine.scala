package typings.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "StateMachine")
@js.native
/**
  * Constructs a new state machine with the given values.
  *
  * @param [owner=null] - The owner of this state machine.
  */
open class StateMachine[T /* <: typings.yuka.gameEntityMod.GameEntity */] ()
  extends typings.yuka.yukaMod.StateMachine[T] {
  def this(owner: T) = this()
}
