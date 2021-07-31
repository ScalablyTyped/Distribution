package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aspect extends StObject {
  
  /**
    * To set the layout of the word cloud. "spiral" | "flow-center" | "flow-top"
    */
  var aspect: js.UndefOr[String] = js.undefined
  
  var button: js.UndefOr[Count] = js.undefined
  
  /**
    * When the "color-type" attribute is set to "color", use this attribute to set the color of the text in the word cloud. "red" | "#3F
    * 51B5" | ...
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * To set the type of color arrangement applied to the word cloud. Use the "color" value with the "color" attribute. Use the "palette
    * " value with the "palette" array. "random" (default) | "color" | "palette"
    */
  var `color-type`: js.UndefOr[String] = js.undefined
  
  var `context-menu`: js.UndefOr[Button] = js.undefined
  
  /**
    * To define words to be excluded from the word cloud, e.g., "and" or "the". [...]
    */
  var ignore: js.UndefOr[js.Any] = js.undefined
  
  var indicator: js.UndefOr[Npv] = js.undefined
  
  /**
    * To set the maximum font size. 20 | "30px" | ...
    */
  var `max-font-size`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * To set the maximum number of items displayed in the word cloud. 100 | 30 | ...
    */
  var `max-items`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * To set the minimum font size. 10 | "12px" | ...
    */
  var `min-font-size`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * To set the minimum length of the words displayed in the word cloud. 3 | 5 | ...
    */
  var `min-length`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * When the "color-type" attribute is set to "palette", use this attribute to set the color palette of the word cloud. [...]
    */
  var palette: js.UndefOr[js.Any] = js.undefined
  
  /**
    * To set whether every one or two words rotates 90 degrees. true | false (default)
    */
  var rotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To control the step metering. Use this with the "step-radius" attribute. 45 | 90 | ...
    */
  var `step-angle`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * To control the step metering. Use this with the "step-angle" attribute. 30 | 50 | ...
    */
  var `step-radius`: js.UndefOr[js.Any] = js.undefined
  
  var style: js.UndefOr[Hoverstate] = js.undefined
  
  /**
    * To provide the data for the word cloud. (Alternatively, data can be provided through a "words" array.) "text data..." | ...
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * To set the type of item to be analyzed: words or characters. "word" (default) | "character"
    */
  var token: js.UndefOr[String] = js.undefined
  
  var violin: js.UndefOr[Jitter] = js.undefined
  
  var words: js.UndefOr[js.Array[Text]] = js.undefined
}
object Aspect {
  
  @scala.inline
  def apply(): Aspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aspect]
  }
  
  @scala.inline
  implicit class AspectMutableBuilder[Self <: Aspect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    @scala.inline
    def setButton(value: Count): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-type`(value: String): Self = StObject.set(x, "color-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-typeUndefined`: Self = StObject.set(x, "color-type", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def `setContext-menu`(value: Button): Self = StObject.set(x, "context-menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContext-menuUndefined`: Self = StObject.set(x, "context-menu", js.undefined)
    
    @scala.inline
    def setIgnore(value: js.Any): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    @scala.inline
    def setIndicator(value: Npv): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    @scala.inline
    def `setMax-font-size`(value: js.Any): Self = StObject.set(x, "max-font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-font-sizeUndefined`: Self = StObject.set(x, "max-font-size", js.undefined)
    
    @scala.inline
    def `setMax-items`(value: js.Any): Self = StObject.set(x, "max-items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-itemsUndefined`: Self = StObject.set(x, "max-items", js.undefined)
    
    @scala.inline
    def `setMin-font-size`(value: js.Any): Self = StObject.set(x, "min-font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-font-sizeUndefined`: Self = StObject.set(x, "min-font-size", js.undefined)
    
    @scala.inline
    def `setMin-length`(value: js.Any): Self = StObject.set(x, "min-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-lengthUndefined`: Self = StObject.set(x, "min-length", js.undefined)
    
    @scala.inline
    def setPalette(value: js.Any): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def `setStep-angle`(value: js.Any): Self = StObject.set(x, "step-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStep-angleUndefined`: Self = StObject.set(x, "step-angle", js.undefined)
    
    @scala.inline
    def `setStep-radius`(value: js.Any): Self = StObject.set(x, "step-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStep-radiusUndefined`: Self = StObject.set(x, "step-radius", js.undefined)
    
    @scala.inline
    def setStyle(value: Hoverstate): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setViolin(value: Jitter): Self = StObject.set(x, "violin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolinUndefined: Self = StObject.set(x, "violin", js.undefined)
    
    @scala.inline
    def setWords(value: js.Array[Text]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: Text*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
