package typings.zdog.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathLineCommand extends PathCommand {
  /** @see {@link https://zzz.dog/shapes#shape-line Zdog Shape API} */
  var line: VectorOptions
}

object PathLineCommand {
  @scala.inline
  def apply(line: VectorOptions): PathLineCommand = {
    val __obj = js.Dynamic.literal(line = line)
  
    __obj.asInstanceOf[PathLineCommand]
  }
}

