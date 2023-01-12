package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGDialog extends StObject {
  
  /**
    * @description Callback method to call on custom dialog when the dialog's "cancel"
    * button is clicked
    */
  var cancel: js.UndefOr[String] = js.undefined
  
  /**
    * @description Callback method to call on custom dialog when the dialog's "confirm"
    * button is clicked
    */
  var confirm: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the dialog's header 'label' text
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * @description The presence of the specification-standard "open" attribute designates whether the dialog is shown or hidden
    */
  var open: js.UndefOr[String] = js.undefined
}
object ZGDialog {
  
  inline def apply(): ZGDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGDialog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZGDialog] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setConfirm(value: String): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
