package typings.zurbTwentytwenty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwentyTwentyOptions extends js.Object {
  
  var after_label: js.UndefOr[String] = js.native
  
  var before_label: js.UndefOr[String] = js.native
  
  var click_to_move: js.UndefOr[Boolean] = js.native
  
  var default_offset_pct: js.UndefOr[Double] = js.native
  
  var move_slider_on_hover: js.UndefOr[Boolean] = js.native
  
  var move_with_handle_only: js.UndefOr[Boolean] = js.native
  
  var no_overlay: js.UndefOr[Boolean] = js.native
  
  var orientation: js.UndefOr[String] = js.native
}
object TwentyTwentyOptions {
  
  @scala.inline
  def apply(): TwentyTwentyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwentyTwentyOptions]
  }
  
  @scala.inline
  implicit class TwentyTwentyOptionsOps[Self <: TwentyTwentyOptions] (val x: Self) extends AnyVal {
    
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
    def setAfter_label(value: String): Self = this.set("after_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter_label: Self = this.set("after_label", js.undefined)
    
    @scala.inline
    def setBefore_label(value: String): Self = this.set("before_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore_label: Self = this.set("before_label", js.undefined)
    
    @scala.inline
    def setClick_to_move(value: Boolean): Self = this.set("click_to_move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick_to_move: Self = this.set("click_to_move", js.undefined)
    
    @scala.inline
    def setDefault_offset_pct(value: Double): Self = this.set("default_offset_pct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_offset_pct: Self = this.set("default_offset_pct", js.undefined)
    
    @scala.inline
    def setMove_slider_on_hover(value: Boolean): Self = this.set("move_slider_on_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove_slider_on_hover: Self = this.set("move_slider_on_hover", js.undefined)
    
    @scala.inline
    def setMove_with_handle_only(value: Boolean): Self = this.set("move_with_handle_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove_with_handle_only: Self = this.set("move_with_handle_only", js.undefined)
    
    @scala.inline
    def setNo_overlay(value: Boolean): Self = this.set("no_overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_overlay: Self = this.set("no_overlay", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
}
