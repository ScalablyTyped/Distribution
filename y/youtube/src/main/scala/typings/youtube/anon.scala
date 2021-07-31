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
    
    @scala.inline
    def apply(mediaContentUrl: String): EndSeconds = {
      val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndSeconds]
    }
    
    @scala.inline
    implicit class EndSecondsMutableBuilder[Self <: EndSeconds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndSeconds(value: Double): Self = StObject.set(x, "endSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndSecondsUndefined: Self = StObject.set(x, "endSeconds", js.undefined)
      
      @scala.inline
      def setMediaContentUrl(value: String): Self = StObject.set(x, "mediaContentUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
      
      @scala.inline
      def setSuggestedQuality(value: SuggestedVideoQuality): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
    }
  }
}
