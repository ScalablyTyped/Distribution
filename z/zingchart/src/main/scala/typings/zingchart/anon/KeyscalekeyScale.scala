package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyscalekeyScale extends js.Object {
  /**
    * Sets the key-scale value "scale-k" | "scale-v" | ...
    */
  var `key-scalekeyScale`: js.UndefOr[String] = js.native
  /**
    * Sets the value-scale value "scale-x" | "scale-y" | ...
    */
  var `val-scalevalScale`: js.UndefOr[String] = js.native
}

object KeyscalekeyScale {
  @scala.inline
  def apply(): KeyscalekeyScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyscalekeyScale]
  }
  @scala.inline
  implicit class KeyscalekeyScaleOps[Self <: KeyscalekeyScale] (val x: Self) extends AnyVal {
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
    def `setKey-scalekeyScale`(value: String): Self = this.set("key-scalekeyScale", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteKey-scalekeyScale`: Self = this.set("key-scalekeyScale", js.undefined)
    @scala.inline
    def `setVal-scalevalScale`(value: String): Self = this.set("val-scalevalScale", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVal-scalevalScale`: Self = this.set("val-scalevalScale", js.undefined)
  }
  
}

