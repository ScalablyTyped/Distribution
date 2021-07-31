package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.zdog.mod.VectorOptions
  - typings.zdog.mod.PathLineCommand
  - typings.zdog.mod.PathMoveCommand
  - typings.zdog.mod.PathArcCommand
  - typings.zdog.mod.PathBezierCommand
*/
trait PathCommand extends StObject
object PathCommand {
  
  @scala.inline
  def PathArcCommand(arc: js.Tuple2[VectorOptions, VectorOptions]): typings.zdog.mod.PathArcCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.zdog.mod.PathArcCommand]
  }
  
  @scala.inline
  def PathBezierCommand(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): typings.zdog.mod.PathBezierCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.zdog.mod.PathBezierCommand]
  }
  
  @scala.inline
  def PathLineCommand(line: VectorOptions): typings.zdog.mod.PathLineCommand = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.zdog.mod.PathLineCommand]
  }
  
  @scala.inline
  def PathMoveCommand(move: VectorOptions): typings.zdog.mod.PathMoveCommand = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.zdog.mod.PathMoveCommand]
  }
  
  @scala.inline
  def VectorOptions(): typings.zdog.mod.VectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.zdog.mod.VectorOptions]
  }
}
