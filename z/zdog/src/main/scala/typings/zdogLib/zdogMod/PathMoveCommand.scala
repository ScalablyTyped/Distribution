package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathMoveCommand extends PathCommand {
  /** @see {@link https://zzz.dog/shapes#shape-move Zdog Shape API} */
  var move: VectorOptions
}

object PathMoveCommand {
  @scala.inline
  def apply(move: VectorOptions): PathMoveCommand = {
    val __obj = js.Dynamic.literal(move = move)
  
    __obj.asInstanceOf[PathMoveCommand]
  }
}

