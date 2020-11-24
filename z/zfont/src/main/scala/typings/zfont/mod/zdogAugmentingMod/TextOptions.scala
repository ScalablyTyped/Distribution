package typings.zfont.mod.zdogAugmentingMod

import typings.zdog.mod.ShapeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link Text}
  * @see {@link https://github.com/jaames/zfont#options-1 Zfont API}
  */
@js.native
trait TextOptions[T /* <: MultilineText */] extends ShapeOptions {
  
  /** @see {@link Text#font} */
  val font: Font = js.native
  
  /**
    * Measured in pixels.
    * @default 64
    * @see {@link Text#fontSize}
    */
  val fontSize: js.UndefOr[Double] = js.native
  
  /**
    * @default 'left'
    * @see {@link Text#textAlign}
    */
  val textAlign: js.UndefOr[TextAlign] = js.native
  
  /**
    * @default 'bottom'
    * @see {@link Text#textBaseline}
    */
  val textBaseline: js.UndefOr[TextBaseline] = js.native
  
  /**
    * @default ''
    * @see {@link Text#value}
    */
  val value: js.UndefOr[T] = js.native
}
object TextOptions {
  
  @scala.inline
  def apply[T /* <: MultilineText */](font: Font): TextOptions[T] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions[T]]
  }
  
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions[_], T /* <: MultilineText */] (val x: Self with TextOptions[T]) extends AnyVal {
    
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
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
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
