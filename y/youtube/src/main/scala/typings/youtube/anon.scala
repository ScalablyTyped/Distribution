package typings.youtube

import typings.youtube.YT.SuggestedVideoQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EndSeconds extends StObject {
    
    var endSeconds: js.UndefOr[Double] = js.undefined
    
    var mediaContentUrl: String
    
    var startSeconds: js.UndefOr[Double] = js.undefined
    
    var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.undefined
  }
  object EndSeconds {
    
    inline def apply(mediaContentUrl: String): EndSeconds = {
      val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndSeconds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndSeconds] (val x: Self) extends AnyVal {
      
      inline def setEndSeconds(value: Double): Self = StObject.set(x, "endSeconds", value.asInstanceOf[js.Any])
      
      inline def setEndSecondsUndefined: Self = StObject.set(x, "endSeconds", js.undefined)
      
      inline def setMediaContentUrl(value: String): Self = StObject.set(x, "mediaContentUrl", value.asInstanceOf[js.Any])
      
      inline def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
      
      inline def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
      
      inline def setSuggestedQuality(value: SuggestedVideoQuality): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
      
      inline def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
    }
  }
}
