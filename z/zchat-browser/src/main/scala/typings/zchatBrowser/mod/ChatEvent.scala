package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.LINK_ACTION
import typings.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE
import typings.zchatBrowser.zchatBrowserStrings.QUICK_REPLY_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChatEvent {
  
  trait Action extends StObject {
    
    var `type`: QUICK_REPLY_ACTION | LINK_ACTION
    
    var value: String
  }
  object Action {
    
    @scala.inline
    def apply(`type`: QUICK_REPLY_ACTION | LINK_ACTION, value: String): Action = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: QUICK_REPLY_ACTION | LINK_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseChatEventData extends StObject {
    
    var display_name: String
    
    var nick: String
    
    var time_stamp: Double
  }
  object BaseChatEventData {
    
    @scala.inline
    def apply(display_name: String, nick: String, time_stamp: Double): BaseChatEventData = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseChatEventData]
    }
    
    @scala.inline
    implicit class BaseChatEventDataMutableBuilder[Self <: BaseChatEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Button extends StObject {
    
    var action: Action
    
    var text: String
  }
  object Button {
    
    @scala.inline
    def apply(action: Action, text: String): Button = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.zchatBrowser.anon.BaseChatEventDatatypechat
    - typings.zchatBrowser.anon.BaseChatEventDatatypechatAttachment
    - typings.zchatBrowser.anon.BaseChatEventDatatypechatDisplayname
    - typings.zchatBrowser.anon.BaseChatEventDatatypechatNick
    - typings.zchatBrowser.anon.BaseChatEventDatatypechatTimestamp
    - typings.zchatBrowser.anon.BaseChatEventDatatypechatNewrating
    - typings.zchatBrowser.anon.BaseChatEventDatatypechatComment
  */
  trait ChatEventData
    extends StObject
       with EventData
  object ChatEventData {
    
    @scala.inline
    def BaseChatEventDatatypechat(
      display_name: String,
      msg: String,
      nick: String,
      options: js.Array[String],
      structured_msg: StructuredMessage,
      time_stamp: Double
    ): typings.zchatBrowser.anon.BaseChatEventDatatypechat = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("chat.msg")
      __obj.asInstanceOf[typings.zchatBrowser.anon.BaseChatEventDatatypechat]
    }
    
    @scala.inline
    def BaseChatEventDatatypechatAttachment(attachment: Attachment, deleted: Boolean, display_name: String, nick: String, time_stamp: Double): typings.zchatBrowser.anon.BaseChatEventDatatypechatAttachment = {
      val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("chat.file")
      __obj.asInstanceOf[typings.zchatBrowser.anon.BaseChatEventDatatypechatAttachment]
    }
    
    @scala.inline
    def BaseChatEventDatatypechatComment(display_name: String, nick: String, time_stamp: Double): typings.zchatBrowser.anon.BaseChatEventDatatypechatComment = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("chat.comment")
      __obj.asInstanceOf[typings.zchatBrowser.anon.BaseChatEventDatatypechatComment]
    }
    
    @scala.inline
    def BaseChatEventDatatypechatDisplayname(display_name: String, nick: String, time_stamp: Double): typings.zchatBrowser.anon.BaseChatEventDatatypechatDisplayname = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("chat.memberjoin")
      __obj.asInstanceOf[typings.zchatBrowser.anon.BaseChatEventDatatypechatDisplayname]
    }
    
    @scala.inline
    def BaseChatEventDatatypechatNewrating(display_name: String, nick: String, time_stamp: Double): typings.zchatBrowser.anon.BaseChatEventDatatypechatNewrating = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("chat.rating")
      __obj.asInstanceOf[typings.zchatBrowser.anon.BaseChatEventDatatypechatNewrating]
    }
    
    @scala.inline
    def BaseChatEventDatatypechatNick(display_name: String, nick: String, time_stamp: Double): typings.zchatBrowser.anon.BaseChatEventDatatypechatNick = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("chat.memberleave")
      __obj.asInstanceOf[typings.zchatBrowser.anon.BaseChatEventDatatypechatNick]
    }
    
    @scala.inline
    def BaseChatEventDatatypechatTimestamp(display_name: String, nick: String, time_stamp: Double): typings.zchatBrowser.anon.BaseChatEventDatatypechatTimestamp = {
      val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("chat.request.rating")
      __obj.asInstanceOf[typings.zchatBrowser.anon.BaseChatEventDatatypechatTimestamp]
    }
  }
  
  trait ListItem extends StObject {
    
    var action: Action
    
    var heading: String
    
    var image_url: js.UndefOr[String] = js.undefined
    
    var paragraph: String
  }
  object ListItem {
    
    @scala.inline
    def apply(action: Action, heading: String, paragraph: String): ListItem = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItem]
    }
    
    @scala.inline
    implicit class ListItemMutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
      
      @scala.inline
      def setParagraph(value: String): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    }
  }
  
  trait Panel extends StObject {
    
    var action: Action
    
    var heading: String
    
    var image_url: String
    
    var paragraph: js.UndefOr[String] = js.undefined
  }
  object Panel {
    
    @scala.inline
    def apply(action: Action, heading: String, image_url: String): Panel = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Panel]
    }
    
    @scala.inline
    implicit class PanelMutableBuilder[Self <: Panel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraph(value: String): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    }
  }
  
  trait PanelTemplate extends StObject {
    
    var buttons: js.Array[Button]
    
    var panel: Panel
    
    var `type`: PANEL_TEMPLATE
  }
  object PanelTemplate {
    
    @scala.inline
    def apply(buttons: js.Array[Button], panel: Panel): PanelTemplate = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PANEL_TEMPLATE")
      __obj.asInstanceOf[PanelTemplate]
    }
    
    @scala.inline
    implicit class PanelTemplateMutableBuilder[Self <: PanelTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setPanel(value: Panel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PANEL_TEMPLATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.zchatBrowser.anon.Msg
    - typings.zchatBrowser.anon.Buttons
    - typings.zchatBrowser.anon.Items
    - typings.zchatBrowser.anon.Type
  */
  trait StructuredMessage extends StObject
  object StructuredMessage {
    
    @scala.inline
    def Buttons(buttons: js.Array[Button], panel: Panel): typings.zchatBrowser.anon.Buttons = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PANEL_TEMPLATE")
      __obj.asInstanceOf[typings.zchatBrowser.anon.Buttons]
    }
    
    @scala.inline
    def Items(items: js.Array[PanelTemplate]): typings.zchatBrowser.anon.Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PANEL_TEMPLATE_CAROUSEL")
      __obj.asInstanceOf[typings.zchatBrowser.anon.Items]
    }
    
    @scala.inline
    def Msg(msg: String, quick_replies: js.Array[Button]): typings.zchatBrowser.anon.Msg = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("QUICK_REPLIES")
      __obj.asInstanceOf[typings.zchatBrowser.anon.Msg]
    }
    
    @scala.inline
    def Type(buttons: js.Array[Button], items: js.Array[ListItem]): typings.zchatBrowser.anon.Type = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LIST_TEMPLATE")
      __obj.asInstanceOf[typings.zchatBrowser.anon.Type]
    }
  }
}
