package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGCard> */
trait KebabKeysZGCard extends StObject {
  
  var editor: js.UndefOr[String] = js.undefined
  
  var editorTemplate: js.UndefOr[String] = js.undefined
  
  var renderer: js.UndefOr[String] = js.undefined
  
  var rendererTemplate: js.UndefOr[String] = js.undefined
}
object KebabKeysZGCard {
  
  inline def apply(): KebabKeysZGCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGCard]
  }
  
  extension [Self <: KebabKeysZGCard](x: Self) {
    
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
