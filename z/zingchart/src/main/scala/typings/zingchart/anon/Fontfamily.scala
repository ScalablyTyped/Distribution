package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fontfamily extends js.Object {
  /**
    * To set the font color. 'gray' | '#666699' | ...
    */
  var `font-color`: js.UndefOr[js.Any] = js.native
  /**
    * To set the font family. 'Arial' | 'Georgia' | ...
    */
  var `font-family`: js.UndefOr[String] = js.native
  /**
    * To set the font size. 30 | 24 | 16 | ...
    */
  var `font-size`: js.UndefOr[Double] = js.native
  /**
    * To set the font style. 'normal' | 'italic'
    */
  var `font-style`: js.UndefOr[String] = js.native
  /**
    * To set the font weight. 'normal' | 'bold'
    */
  var `font-weight`: js.UndefOr[String] = js.native
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Fontfamily {
  @scala.inline
  def apply(): Fontfamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fontfamily]
  }
  @scala.inline
  implicit class FontfamilyOps[Self <: Fontfamily] (val x: Self) extends AnyVal {
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
    def `setFont-color`(value: js.Any): Self = this.set("font-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-color`: Self = this.set("font-color", js.undefined)
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    @scala.inline
    def `setFont-size`(value: Double): Self = this.set("font-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    @scala.inline
    def `setFont-style`(value: String): Self = this.set("font-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    @scala.inline
    def `setFont-weight`(value: String): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

