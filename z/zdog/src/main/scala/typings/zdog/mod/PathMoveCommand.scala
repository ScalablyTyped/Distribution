package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMoveCommand
  extends StObject
     with PathCommand {
  
  /** @see {@link https://zzz.dog/shapes#shape-move Zdog Shape API} */
  var move: VectorOptions
}
object PathMoveCommand {
  
  @scala.inline
  def apply(move: VectorOptions): PathMoveCommand = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMoveCommand]
  }
  
  @scala.inline
  implicit class PathMoveCommandMutableBuilder[Self <: PathMoveCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMove(value: VectorOptions): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
  }
}
