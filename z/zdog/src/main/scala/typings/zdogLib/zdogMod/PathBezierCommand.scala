package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathBezierCommand extends PathCommand {
  /** @see {@link https://zzz.dog/shapes#shape-bezier Zdog Shape API} */
  var bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]
}

object PathBezierCommand {
  @scala.inline
  def apply(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): PathBezierCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier)
  
    __obj.asInstanceOf[PathBezierCommand]
  }
}

