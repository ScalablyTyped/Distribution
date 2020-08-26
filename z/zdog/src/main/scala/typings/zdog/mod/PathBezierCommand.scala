package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathBezierCommand extends PathCommand {
  /** @see {@link https://zzz.dog/shapes#shape-bezier Zdog Shape API} */
  var bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions] = js.native
}

object PathBezierCommand {
  @scala.inline
  def apply(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): PathBezierCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBezierCommand]
  }
  @scala.inline
  implicit class PathBezierCommandOps[Self <: PathBezierCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBezier(value: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): Self = this.set("bezier", value.asInstanceOf[js.Any])
  }
  
}

