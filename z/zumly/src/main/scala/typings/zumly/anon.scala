package typings.zumly

import typings.zumly.zumlyStrings.blur
import typings.zumly.zumlyStrings.height
import typings.zumly.zumlyStrings.saturate
import typings.zumly.zumlyStrings.sepia
import typings.zumly.zumlyStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cover extends StObject {
    
    // How new injected view is adapted. String. Default 'width'
    var cover: height | width = js.native
    
    // Transition duration. Default '1s'
    var duration: String = js.native
    
    // Transition ease. Default 'ease-in-out'
    var ease: String = js.native
    
    // Effects for background views
    var effects: js.Array[blur | sepia | saturate] = js.native
  }
  object Cover {
    
    @scala.inline
    def apply(cover: height | width, duration: String, ease: String, effects: js.Array[blur | sepia | saturate]): Cover = {
      val __obj = js.Dynamic.literal(cover = cover.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cover]
    }
    
    @scala.inline
    implicit class CoverMutableBuilder[Self <: Cover] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCover(value: height | width): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffects(value: js.Array[blur | sepia | saturate]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectsVarargs(value: (blur | sepia | saturate)*): Self = StObject.set(x, "effects", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Render extends StObject {
    
    def render(): js.Promise[String] = js.native
  }
  object Render {
    
    @scala.inline
    def apply(render: () => js.Promise[String]): Render = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[Render]
    }
    
    @scala.inline
    implicit class RenderMutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: () => js.Promise[String]): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
}
