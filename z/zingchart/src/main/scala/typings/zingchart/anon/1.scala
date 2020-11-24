package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends js.Object {
  
  var `1`: js.UndefOr[js.Any] = js.native
  
  var `10`: js.UndefOr[js.Any] = js.native
  
  var `11`: js.UndefOr[js.Any] = js.native
  
  var `12`: js.UndefOr[js.Any] = js.native
  
  var `13`: js.UndefOr[js.Any] = js.native
  
  var `2`: js.UndefOr[js.Any] = js.native
  
  var `3`: js.UndefOr[js.Any] = js.native
  
  var `4`: js.UndefOr[js.Any] = js.native
  
  var `5`: js.UndefOr[js.Any] = js.native
  
  var `6`: js.UndefOr[js.Any] = js.native
  
  var `7`: js.UndefOr[js.Any] = js.native
  
  var `8`: js.UndefOr[js.Any] = js.native
  
  var `9`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the delay in milliseconds between each step of the animation. 5 | 10 | ...
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Sets the animation effect. Numeric Code String Name 1 `ANIMGATION_FADE_IN` 2 `ANIMATION_EXPAND_VERTICAL` 3 `ANIMATION_EXPAND_TOP`
    * 4 `ANIMATION_EXPAND_BOTTOM` 5 `ANIMGATION_FADE_IN` 6 `ANIMATION_EXPAND_RIGHT` 7 `ANIMATION_EXPAND_HORIZONTAL` 8 `ANIMATION_SLIDE_L
    * EFT` 9 `ANIMATION_SLIDE_RIGHT` 10 `ANIMATION_SLIDE_TOP` 11 `ANIMATION_SLIDE_BOTTOM` 12 `ANIMATION_UNFOLD_HORIZONTAL` 13 `ANIMATION
    * _UNFOLD_VERTICAL`
    */
  var effect: js.UndefOr[Double] = js.native
  
  /**
    * Determines whether or not animation occurs when a change is made to the chart via an API event (e.g., adding node, adding plot, re
    * moving node). true (default) | false | 1 | 0
    */
  var `on-change`: js.UndefOr[Boolean] = js.native
  
  var `on-legend-toggle`: js.UndefOr[js.Any] = js.native
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    
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
    def set1(value: js.Any): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
    
    @scala.inline
    def set10(value: js.Any): Self = this.set("10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete10: Self = this.set("10", js.undefined)
    
    @scala.inline
    def set11(value: js.Any): Self = this.set("11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete11: Self = this.set("11", js.undefined)
    
    @scala.inline
    def set12(value: js.Any): Self = this.set("12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete12: Self = this.set("12", js.undefined)
    
    @scala.inline
    def set13(value: js.Any): Self = this.set("13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete13: Self = this.set("13", js.undefined)
    
    @scala.inline
    def set2(value: js.Any): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete2: Self = this.set("2", js.undefined)
    
    @scala.inline
    def set3(value: js.Any): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete3: Self = this.set("3", js.undefined)
    
    @scala.inline
    def set4(value: js.Any): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete4: Self = this.set("4", js.undefined)
    
    @scala.inline
    def set5(value: js.Any): Self = this.set("5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete5: Self = this.set("5", js.undefined)
    
    @scala.inline
    def set6(value: js.Any): Self = this.set("6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete6: Self = this.set("6", js.undefined)
    
    @scala.inline
    def set7(value: js.Any): Self = this.set("7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete7: Self = this.set("7", js.undefined)
    
    @scala.inline
    def set8(value: js.Any): Self = this.set("8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete8: Self = this.set("8", js.undefined)
    
    @scala.inline
    def set9(value: js.Any): Self = this.set("9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete9: Self = this.set("9", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setEffect(value: Double): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def `setOn-change`(value: Boolean): Self = this.set("on-change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOn-change`: Self = this.set("on-change", js.undefined)
    
    @scala.inline
    def `setOn-legend-toggle`(value: js.Any): Self = this.set("on-legend-toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOn-legend-toggle`: Self = this.set("on-legend-toggle", js.undefined)
  }
}
