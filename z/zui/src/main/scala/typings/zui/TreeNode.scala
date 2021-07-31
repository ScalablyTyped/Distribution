package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * treeview
  */
trait TreeNode extends StObject {
  
  var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object TreeNode {
  
  @scala.inline
  def apply(): TreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeNode]
  }
  
  @scala.inline
  implicit class TreeNodeMutableBuilder[Self <: TreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
