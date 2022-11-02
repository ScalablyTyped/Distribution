package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an entry in a zip file (Filesystem API).
  */
trait ZipEntry extends StObject {
  
  /**
    * The children of the entry.
    */
  var children: js.Array[ZipEntry]
  
  /**
    * The underlying {@link EntryMetaData} instance.
    */
  var data: js.UndefOr[EntryMetaData] = js.undefined
  
  /**
    * Returns the full filename of the entry
    */
  def getFullname(): String
  
  /**
    * Returns the filename of the entry relative to a parent directory
    */
  def getRelativeName(ancestor: ZipDirectoryEntry): String
  
  /**
    * The ID of the instance.
    */
  var id: Double
  
  /**
    * Tests if a {@link ZipDirectoryEntry} instance is an ancestor of the entry
    * 
    * @param ancestor The {@link ZipDirectoryEntry} instance.
    */
  def isDescendantOf(ancestor: ZipDirectoryEntry): Boolean
  
  /**
    * The relative filename of the entry.
    */
  var name: String
  
  /**
    * The parent directory of the entry.
    */
  var parent: js.UndefOr[ZipEntry] = js.undefined
  
  /**
    * The uncompressed size of the content.
    */
  var uncompressedSize: Double
}
object ZipEntry {
  
  inline def apply(
    children: js.Array[ZipEntry],
    getFullname: () => String,
    getRelativeName: ZipDirectoryEntry => String,
    id: Double,
    isDescendantOf: ZipDirectoryEntry => Boolean,
    name: String,
    uncompressedSize: Double
  ): ZipEntry = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], getFullname = js.Any.fromFunction0(getFullname), getRelativeName = js.Any.fromFunction1(getRelativeName), id = id.asInstanceOf[js.Any], isDescendantOf = js.Any.fromFunction1(isDescendantOf), name = name.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipEntry]
  }
  
  extension [Self <: ZipEntry](x: Self) {
    
    inline def setChildren(value: js.Array[ZipEntry]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ZipEntry*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setData(value: EntryMetaData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGetFullname(value: () => String): Self = StObject.set(x, "getFullname", js.Any.fromFunction0(value))
    
    inline def setGetRelativeName(value: ZipDirectoryEntry => String): Self = StObject.set(x, "getRelativeName", js.Any.fromFunction1(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDescendantOf(value: ZipDirectoryEntry => Boolean): Self = StObject.set(x, "isDescendantOf", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ZipEntry): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setUncompressedSize(value: Double): Self = StObject.set(x, "uncompressedSize", value.asInstanceOf[js.Any])
  }
}
