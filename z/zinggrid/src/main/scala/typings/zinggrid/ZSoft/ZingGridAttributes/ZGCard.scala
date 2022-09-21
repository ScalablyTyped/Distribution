package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGCard extends StObject {
  
  /**
    * @description Sets the custom editor
    */
  var editor: js.UndefOr[String] = js.undefined
  
  /**
    * @description Points to an external template element to be used as the template for the card's editor
    */
  var editorTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * @description The return value of the method is set as the innerHTML of "<zg-card>".  If nothing is returned,
    * it will not change the currently rendered card. The method takes the paramters "data", "domCard", and "rowObject".
    */
  var renderer: js.UndefOr[String] = js.undefined
  
  /**
    * @description Points to an external template element to be used as the template for the card's render.
    */
  var rendererTemplate: js.UndefOr[String] = js.undefined
}
object ZGCard {
  
  inline def apply(): ZGCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGCard]
  }
  
  extension [Self <: ZGCard](x: Self) {
    
    inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorTemplate(value: String): Self = StObject.set(x, "editorTemplate", value.asInstanceOf[js.Any])
    
    inline def setEditorTemplateUndefined: Self = StObject.set(x, "editorTemplate", js.undefined)
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererTemplate(value: String): Self = StObject.set(x, "rendererTemplate", value.asInstanceOf[js.Any])
    
    inline def setRendererTemplateUndefined: Self = StObject.set(x, "rendererTemplate", js.undefined)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
