package typings.zdog.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.zdog.zdogMod.VectorOptions
  - typings.zdog.zdogMod.PathLineCommand
  - typings.zdog.zdogMod.PathMoveCommand
  - typings.zdog.zdogMod.PathArcCommand
  - typings.zdog.zdogMod.PathBezierCommand
*/
trait PathCommand extends js.Object

object PathCommand {
  @scala.inline
  def PathLineCommand(line: VectorOptions): PathCommand = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathCommand]
  }
  @scala.inline
  def VectorOptions(x: Int | Double = null, y: Int | Double = null, z: Int | Double = null): PathCommand = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  @scala.inline
  def PathBezierCommand(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): PathCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathCommand]
  }
  @scala.inline
  def PathMoveCommand(move: VectorOptions): PathCommand = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathCommand]
  }
  @scala.inline
  def PathArcCommand(arc: js.Tuple2[VectorOptions, VectorOptions]): PathCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathCommand]
  }
}

