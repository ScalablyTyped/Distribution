package typings.zfont.mod.zdogAugmentingMod

import typings.zdog.mod.GroupOptions
import typings.zfont.zfontBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link TextGroup}
  * @see {@link https://github.com/jaames/zfont#options-2 Zfont API}
  */
@js.native
trait TextGroupOptions[T /* <: MultilineText */] extends GroupOptions {
  /**
    * @default '#333'
    * @see {@link TextGroup#color}
    */
  val color: js.UndefOr[String] = js.native
  /**
    * @default false
    * @see {@link TextGroup#fill}
    */
  val fill: js.UndefOr[Boolean] = js.native
  /** @see {@link TextGroup#font} */
  val font: Font = js.native
  /**
    * Measured in pixels.
    * @default 64
    * @see {@link TextGroup#fontSize}
    */
  val fontSize: js.UndefOr[Double] = js.native
  /**
    * @default 1
    * @see {@link TextGroup#stroke}
    */
  val stroke: js.UndefOr[Double | `false`] = js.native
  /**
    * @default 'left'
    * @see {@link TextGroup#textAlign}
    */
  val textAlign: js.UndefOr[TextAlign] = js.native
  /**
    * @default 'bottom'
    * @see {@link TextGroup#textBaseline}
    */
  val textBaseline: js.UndefOr[TextBaseline] = js.native
  /**
    * @default ''
    * @see {@link TextGroup#value}
    */
  val value: js.UndefOr[T] = js.native
}

object TextGroupOptions {
  @scala.inline
  def apply[/* <: typings.zfont.mod.zdogAugmentingMod.MultilineText */ T](font: Font): TextGroupOptions[T] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextGroupOptions[T]]
  }
  @scala.inline
  implicit class TextGroupOptionsOps[Self <: TextGroupOptions[_], /* <: typings.zfont.mod.zdogAugmentingMod.MultilineText */ T] (val x: Self with TextGroupOptions[T]) extends AnyVal {
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
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setStroke(value: Double | `false`): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setTextAlign(value: TextAlign): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextBaseline(value: TextBaseline): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBaseline: Self = this.set("textBaseline", js.undefined)
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

