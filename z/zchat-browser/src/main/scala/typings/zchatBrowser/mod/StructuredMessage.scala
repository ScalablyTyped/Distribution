package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.BUTTON_TEMPLATE
import typings.zchatBrowser.zchatBrowserStrings.LINK_ACTION
import typings.zchatBrowser.zchatBrowserStrings.LIST_TEMPLATE
import typings.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE
import typings.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import typings.zchatBrowser.zchatBrowserStrings.QUICK_REPLIES
import typings.zchatBrowser.zchatBrowserStrings.QUICK_REPLY_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StructuredMessage {
  
  trait Action[T /* <: QUICK_REPLY_ACTION | LINK_ACTION */] extends StObject {
    
    var `type`: T
    
    var value: String
  }
  object Action {
    
    inline def apply[T /* <: QUICK_REPLY_ACTION | LINK_ACTION */](`type`: T, value: String): Action[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    extension [Self <: Action[?], T /* <: QUICK_REPLY_ACTION | LINK_ACTION */](x: Self & Action[T]) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Button[T /* <: QUICK_REPLY_ACTION | LINK_ACTION */] extends StObject {
    
    var action: Action[T]
    
    var text: String
  }
  object Button {
    
    inline def apply[T /* <: QUICK_REPLY_ACTION | LINK_ACTION */](action: Action[T], text: String): Button[T] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Button[T]]
    }
    
    extension [Self <: Button[?], T /* <: QUICK_REPLY_ACTION | LINK_ACTION */](x: Self & Button[T]) {
      
      inline def setAction(value: Action[T]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ButtonTemplate
    extends StObject
       with Message {
    
    var buttons: js.Array[Button[QUICK_REPLY_ACTION | LINK_ACTION]]
    
    var msg: String
    
    var `type`: BUTTON_TEMPLATE
  }
  object ButtonTemplate {
    
    inline def apply(buttons: js.Array[Button[QUICK_REPLY_ACTION | LINK_ACTION]], msg: String): ButtonTemplate = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("BUTTON_TEMPLATE")
      __obj.asInstanceOf[ButtonTemplate]
    }
    
    extension [Self <: ButtonTemplate](x: Self) {
      
      inline def setButtons(value: js.Array[Button[QUICK_REPLY_ACTION | LINK_ACTION]]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsVarargs(value: (Button[QUICK_REPLY_ACTION | LINK_ACTION])*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setType(value: BUTTON_TEMPLATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListItem extends StObject {
    
    var action: Action[LINK_ACTION]
    
    var heading: String
    
    var image_url: js.UndefOr[String] = js.undefined
    
    var paragraph: String
  }
  object ListItem {
    
    inline def apply(action: Action[LINK_ACTION], heading: String, paragraph: String): ListItem = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItem]
    }
    
    extension [Self <: ListItem](x: Self) {
      
      inline def setAction(value: Action[LINK_ACTION]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
      
      inline def setParagraph(value: String): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListTemplate
    extends StObject
       with Message {
    
    var buttons: js.UndefOr[js.Array[Button[QUICK_REPLY_ACTION | LINK_ACTION]]] = js.undefined
    
    var items: js.Array[ListItem]
    
    var `type`: LIST_TEMPLATE
  }
  object ListTemplate {
    
    inline def apply(items: js.Array[ListItem]): ListTemplate = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LIST_TEMPLATE")
      __obj.asInstanceOf[ListTemplate]
    }
    
    extension [Self <: ListTemplate](x: Self) {
      
      inline def setButtons(value: js.Array[Button[QUICK_REPLY_ACTION | LINK_ACTION]]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: (Button[QUICK_REPLY_ACTION | LINK_ACTION])*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setItems(value: js.Array[ListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ListItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setType(value: LIST_TEMPLATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.zchatBrowser.mod.StructuredMessage.QuickReplies
    - typings.zchatBrowser.mod.StructuredMessage.ButtonTemplate
    - typings.zchatBrowser.mod.StructuredMessage.PanelTemplate
    - typings.zchatBrowser.mod.StructuredMessage.PanelTemplateCarousel
    - typings.zchatBrowser.mod.StructuredMessage.ListTemplate
  */
  trait Message extends StObject
  object Message {
    
    inline def ButtonTemplate(buttons: js.Array[Button[QUICK_REPLY_ACTION | LINK_ACTION]], msg: String): typings.zchatBrowser.mod.StructuredMessage.ButtonTemplate = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("BUTTON_TEMPLATE")
      __obj.asInstanceOf[typings.zchatBrowser.mod.StructuredMessage.ButtonTemplate]
    }
    
    inline def ListTemplate(items: js.Array[ListItem]): typings.zchatBrowser.mod.StructuredMessage.ListTemplate = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LIST_TEMPLATE")
      __obj.asInstanceOf[typings.zchatBrowser.mod.StructuredMessage.ListTemplate]
    }
    
    inline def PanelTemplate(panel: Panel): typings.zchatBrowser.mod.StructuredMessage.PanelTemplate = {
      val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PANEL_TEMPLATE")
      __obj.asInstanceOf[typings.zchatBrowser.mod.StructuredMessage.PanelTemplate]
    }
    
    inline def PanelTemplateCarousel(items: js.Array[PanelTemplate]): typings.zchatBrowser.mod.StructuredMessage.PanelTemplateCarousel = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PANEL_TEMPLATE_CAROUSEL")
      __obj.asInstanceOf[typings.zchatBrowser.mod.StructuredMessage.PanelTemplateCarousel]
    }
    
    inline def QuickReplies(msg: String, quick_replies: js.Array[Button[QUICK_REPLY_ACTION]]): typings.zchatBrowser.mod.StructuredMessage.QuickReplies = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("QUICK_REPLIES")
      __obj.asInstanceOf[typings.zchatBrowser.mod.StructuredMessage.QuickReplies]
    }
  }
  
  trait Panel extends StObject {
    
    var action: js.UndefOr[Action[LINK_ACTION]] = js.undefined
    
    var heading: String
    
    var image_url: js.UndefOr[String] = js.undefined
    
    var paragraph: js.UndefOr[String] = js.undefined
  }
  object Panel {
    
    inline def apply(heading: String): Panel = {
      val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any])
      __obj.asInstanceOf[Panel]
    }
    
    extension [Self <: Panel](x: Self) {
      
      inline def setAction(value: Action[LINK_ACTION]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
      
      inline def setParagraph(value: String): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    }
  }
  
  trait PanelTemplate
    extends StObject
       with Message {
    
    var buttons: js.UndefOr[js.Array[Button[LINK_ACTION]]] = js.undefined
    
    var panel: Panel
    
    var `type`: PANEL_TEMPLATE
  }
  object PanelTemplate {
    
    inline def apply(panel: Panel): PanelTemplate = {
      val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PANEL_TEMPLATE")
      __obj.asInstanceOf[PanelTemplate]
    }
    
    extension [Self <: PanelTemplate](x: Self) {
      
      inline def setButtons(value: js.Array[Button[LINK_ACTION]]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: Button[LINK_ACTION]*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setPanel(value: Panel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setType(value: PANEL_TEMPLATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PanelTemplateCarousel
    extends StObject
       with Message {
    
    var items: js.Array[PanelTemplate]
    
    var `type`: PANEL_TEMPLATE_CAROUSEL
  }
  object PanelTemplateCarousel {
    
    inline def apply(items: js.Array[PanelTemplate]): PanelTemplateCarousel = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PANEL_TEMPLATE_CAROUSEL")
      __obj.asInstanceOf[PanelTemplateCarousel]
    }
    
    extension [Self <: PanelTemplateCarousel](x: Self) {
      
      inline def setItems(value: js.Array[PanelTemplate]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: PanelTemplate*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setType(value: PANEL_TEMPLATE_CAROUSEL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuickReplies
    extends StObject
       with Message {
    
    var msg: String
    
    var quick_replies: js.Array[Button[QUICK_REPLY_ACTION]]
    
    var `type`: QUICK_REPLIES
  }
  object QuickReplies {
    
    inline def apply(msg: String, quick_replies: js.Array[Button[QUICK_REPLY_ACTION]]): QuickReplies = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("QUICK_REPLIES")
      __obj.asInstanceOf[QuickReplies]
    }
    
    extension [Self <: QuickReplies](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setQuick_replies(value: js.Array[Button[QUICK_REPLY_ACTION]]): Self = StObject.set(x, "quick_replies", value.asInstanceOf[js.Any])
      
      inline def setQuick_repliesVarargs(value: Button[QUICK_REPLY_ACTION]*): Self = StObject.set(x, "quick_replies", js.Array(value*))
      
      inline def setType(value: QUICK_REPLIES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
