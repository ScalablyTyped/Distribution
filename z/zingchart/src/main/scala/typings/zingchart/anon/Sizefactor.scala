package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sizefactor extends js.Object {
  /**
    * To modify the size of the chart. Provide a value in relation to 1.0 or 100%. 0.3 | 0.9 | "30%" | "90%" | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.native
}

object Sizefactor {
  @scala.inline
  def apply(): Sizefactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sizefactor]
  }
  @scala.inline
  implicit class SizefactorOps[Self <: Sizefactor] (val x: Self) extends AnyVal {
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
    def `setSize-factor`(value: Double): Self = this.set("size-factor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSize-factor`: Self = this.set("size-factor", js.undefined)
  }
  
}

