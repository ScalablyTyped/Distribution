package typings.zinggrid

import typings.std.Element
import typings.std.HTMLElement
import typings.zinggrid.ZSoft.ZingGridConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ZSoft {
    
    @JSGlobal("ZSoft.ZingGrid")
    @js.native
    open class ZingGrid protected ()
      extends StObject
         with typings.zinggrid.ZSoft.ZingGrid {
      def this(config: ZingGridConfig, ref: Element) = this()
      def this(config: ZingGridConfig, ref: HTMLElement) = this()
      def this(ref: Element, config: ZingGridConfig) = this()
      def this(ref: HTMLElement, config: ZingGridConfig) = this()
    }
  }
  
  @JSGlobal("ZingGrid")
  @js.native
  open class ZingGrid ()
    extends StObject
       with typings.zinggrid.ZSoft.ZingGrid
  object ZingGrid {
    
    @JSGlobal("ZingGrid")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @description Customizes the user's dialog for all instances of ZingGrid
      * @param type The type of dialog to customize.  If you set as null, the config will be applied to all dialogs.
      * Options are:
      * <ul>
      * <li>record-create
      * <li>record-delete
      * <li>record-info
      * <li>record-update
      * <li>view-error
      * <li>view-info
      * <li>view-success
      * <li>view-warn
      * <li>zg-version
      * </ul>
      * @param config Options for the data retrieval.  Options are:
      * <ul>
      * <li>cancel: Text for the Cancel Button
      * <li>confirm: Text for the Confirm Button
      * <li>label: Label to display on the Dialog
      * </ul>
      */
    inline def customizeDialog(`type`: String, config: Any): typings.zinggrid.ZingGrid = (^.asInstanceOf[js.Dynamic].applyDynamic("customizeDialog")(`type`.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.zinggrid.ZingGrid]
    
    /**
      * @description Formats a Date
      * @param date The Date to format
      * @param format The tokenized format to format the date
      * @param locale The locale to use for the formatting.  Optional.
      */
    inline def formatDate(date: String, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: String, format: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: js.Date, format: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * @description Formats a Date in from now format
      * @param date The Date to format
      * @param raw Indicates if we should include 'ago/to' to indicate past/future
      */
    inline def fromNow(date: js.Date, raw: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNow")(date.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * @description Register a method to make connecting a remote data src to your grid even easier. If you
      * have your own standardized endpoints this is very useful. A way for us to provide an ES6 style import
      *  mechanism and pattern for building custom data sources.
      * @param sType The string name for the adapter
      * @param oOptions Option list of of adapter variables you want to define. You can define ANY
      * zg-param name value pair here in this option. Refer to the Store.js variable this.oDefaultDataFormat
      */
    inline def registerAdapter(sType: String, oOptions: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdapter")(sType.asInstanceOf[js.Any], oOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Register a custom column type to reduce redundant markup and re-use
      * similar code.
      * @param sType Name of cell type.
      * @param oOptions An object to define the renderer and/or editor for the cell type.
      */
    inline def registerCellType(sType: String, oOptions: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCellType")(sType.asInstanceOf[js.Any], oOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Register the life cycle hooks for cell editing. This allows you to import
      * and inherit editors for your library.
      * @param sCellType Cell type editor to override
      * @param oConfig Object containing editor hooks
      */
    inline def registerEditor(sCellType: String, oConfig: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEditor")(sCellType.asInstanceOf[js.Any], oConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Register a method to make it available to ZingGrid even if it outside the window scope.
      * This can be used to make a method accessible to renderer, editor, sorter, and custom styles
      * This is useful for methods within a class or local methods.
      * @param method The method that you wish to expose to ZingGrid.
      * @param name The name to refer to the method.  If the method is not anonymous, the name will default to the
      * name of the method.  If it is anonymous, a name must be set.  Whatever is set here is how you should refer to the method
      * in the grid. Optional.
      * @param scope The scope of the method.  When the method is called "this" will be set to the "scope" value. Optional.
      */
    inline def registerMethod(method: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMethod")(method.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def registerMethod(method: Any, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMethod")(method.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerMethod(method: Any, name: String, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMethod")(method.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerMethod(method: Any, name: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMethod")(method.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Register a namespace to make it available to ZingGrid even if it outside the window scope.
      * Once a namespace is registered, the methods within the namespace will be accessible to ZingGrid without having to call "ZingGrid.registerMethod"
      * @param namespace The namespace that you wish to expose to ZingGrid.
      * @param name The name to refer to the namespace. Optional.
      * @param scope The scope of the namespace.  When a method within the namespace is called, "this" will be set to the "scope" value.
      * Defaults to the namespace itself. Optional.
      */
    inline def registerNamespace(namespace: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerNamespace")(namespace.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def registerNamespace(namespace: Any, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNamespace")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerNamespace(namespace: Any, name: String, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNamespace")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerNamespace(namespace: Any, name: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNamespace")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Register the life cycle hooks for cell validation. This allows you to import
      * and inherit validators for your library.
      * @param oValidator The validator that you wish to expose to ZingGrid.
      * @param name The name to refer to the validator. Optional.
      * @param scope The scope of the method.  When the method is called "this" will be set to the "scope" value. Optional.
      */
    inline def registerValidator(oValidator: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerValidator")(oValidator.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def registerValidator(oValidator: Any, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerValidator")(oValidator.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerValidator(oValidator: Any, name: String, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerValidator")(oValidator.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerValidator(oValidator: Any, name: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerValidator")(oValidator.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
