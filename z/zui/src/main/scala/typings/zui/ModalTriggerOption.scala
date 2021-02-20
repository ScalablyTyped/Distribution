package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * modal trigger
  */
@js.native
trait ModalTriggerOption extends StObject {
  
  var backdrop: js.UndefOr[Boolean] = js.native
  
  var broken: js.UndefOr[js.Function0[_]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var fade: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[js.Function0[_]] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var iframe: js.UndefOr[String] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var loaded: js.UndefOr[js.Function0[_]] = js.native
  
  var loadingIcon: js.UndefOr[String] = js.native
  
  var moveable: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onHide: js.UndefOr[js.Function0[_]] = js.native
  
  var onShow: js.UndefOr[js.Function0[_]] = js.native
  
  var postion: js.UndefOr[String] = js.native
  
  var rememberPos: js.UndefOr[Boolean] = js.native
  
  var remote: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[js.Function0[_]] = js.native
  
  var showHeader: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var waittime: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object ModalTriggerOption {
  
  @scala.inline
  def apply(): ModalTriggerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalTriggerOption]
  }
  
  @scala.inline
  implicit class ModalTriggerOptionMutableBuilder[Self <: ModalTriggerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    @scala.inline
    def setBroken(value: () => _): Self = StObject.set(x, "broken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBrokenUndefined: Self = StObject.set(x, "broken", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: () => _): Self = StObject.set(x, "hidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIframe(value: String): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setLoaded(value: () => _): Self = StObject.set(x, "loaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    @scala.inline
    def setLoadingIcon(value: String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
    
    @scala.inline
    def setMoveable(value: Boolean): Self = StObject.set(x, "moveable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveableUndefined: Self = StObject.set(x, "moveable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => _): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => _): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setPostion(value: String): Self = StObject.set(x, "postion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostionUndefined: Self = StObject.set(x, "postion", js.undefined)
    
    @scala.inline
    def setRememberPos(value: Boolean): Self = StObject.set(x, "rememberPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRememberPosUndefined: Self = StObject.set(x, "rememberPos", js.undefined)
    
    @scala.inline
    def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    @scala.inline
    def setShow(value: () => _): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWaittime(value: Double): Self = StObject.set(x, "waittime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaittimeUndefined: Self = StObject.set(x, "waittime", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
