package typings.zdog.mod

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
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathLineCommand]
  }
}

