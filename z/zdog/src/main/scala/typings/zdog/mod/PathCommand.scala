package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.zdog.mod.VectorOptions
  - typings.zdog.mod.PathLineCommand
  - typings.zdog.mod.PathMoveCommand
  - typings.zdog.mod.PathArcCommand
  - typings.zdog.mod.PathBezierCommand
*/
trait PathCommand extends js.Object

object PathCommand {
  @scala.inline
  def VectorOptions(
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): PathCommand = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
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
  def PathLineCommand(line: VectorOptions): PathCommand = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  @scala.inline
  def PathArcCommand(arc: js.Tuple2[VectorOptions, VectorOptions]): PathCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
}

