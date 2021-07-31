package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagerOption extends StObject {
  
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  
  var close: js.UndefOr[Boolean] = js.undefined
  
  var contentClass: js.UndefOr[String] = js.undefined
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var fade: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var onAction: js.UndefOr[OnActionFunc] = js.undefined
  
  var parent: js.UndefOr[String] = js.undefined
  
  var placement: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[Boolean] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[MessagerTypeEnum | String] = js.undefined
}
object MessagerOption {
  
  @scala.inline
  def apply(): MessagerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagerOption]
  }
  
  @scala.inline
  implicit class MessagerOptionMutableBuilder[Self <: MessagerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setContentClass(value: String): Self = StObject.set(x, "contentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentClassUndefined: Self = StObject.set(x, "contentClass", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnAction(value: (/* name */ String, /* action */ String, /* messager */ Messager) => js.Any): Self = StObject.set(x, "onAction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setType(value: MessagerTypeEnum | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
