package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverOptions extends StObject {
  
  var animation: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String | Boolean] = js.undefined
  
  var content: js.UndefOr[Any] = js.undefined
  
  var delay: js.UndefOr[Double | js.Object] = js.undefined
  
  var html: js.UndefOr[Boolean] = js.undefined
  
  var placement: js.UndefOr[String | CallBack] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String | CallBack] = js.undefined
  
  var trigger: js.UndefOr[String] = js.undefined
  
  var viewport: js.UndefOr[String | CallBack | js.Object] = js.undefined
}
object PopoverOptions {
  
  inline def apply(): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDelay(value: Double | js.Object): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setPlacement(value: String | CallBack): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementFunction0(value: () => Unit): Self = StObject.set(x, "placement", js.Any.fromFunction0(value))
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTitle(value: String | CallBack): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction0(value: () => Unit): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setViewport(value: String | CallBack | js.Object): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportFunction0(value: () => Unit): Self = StObject.set(x, "viewport", js.Any.fromFunction0(value))
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
