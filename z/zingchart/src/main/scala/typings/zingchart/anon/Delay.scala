package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  /**
    * Sets the delay in milliseconds between each step of the animation. 5 | 10 | ...
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the type of animation effect. ANIMATION_FADE_IN | ANIMATION_EXPAND_VERTICAL | 1 | 2 | ...
    */
  var effect: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the method used for each animation effect. ANIMATION_LINEAR | ANIMATION_BACK_EASE_OUT | 0 | 1 | ...
    */
  var method: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines whether or not animation occurs when a change is made to the chart via an API event (e.g., adding node, adding plot, re
    * moving node). true (default) | false | 1 | 0
    */
  var `on-change`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether or not animation occurs when users toggle legend items on and off. Note that in the "legend" object, the "toggl
    * e-action" attribute must be set to "remove". true (default) | false | 1 | 0
    */
  var `on-legend-toggle`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines animation groups. ANIMATION_NO_SEQUENCE | ANIMATION_BY_PLOT | 0 | 1 | ...
    */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the length of the animation in milliseconds. ANIMATION_SLOW | ANIMATION_FAST | 1000 | 4000 | ...
    */
  var speed: js.UndefOr[Double] = js.undefined
}
object Delay {
  
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setEffect(value: Double): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def `setOn-change`(value: Boolean): Self = StObject.set(x, "on-change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOn-changeUndefined`: Self = StObject.set(x, "on-change", js.undefined)
    
    @scala.inline
    def `setOn-legend-toggle`(value: Boolean): Self = StObject.set(x, "on-legend-toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOn-legend-toggleUndefined`: Self = StObject.set(x, "on-legend-toggle", js.undefined)
    
    @scala.inline
    def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
