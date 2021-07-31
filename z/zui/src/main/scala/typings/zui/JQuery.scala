package typings.zui

import typings.zui.zuiStrings.DateTimePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def affix(): JQuery = js.native
  def affix(options: AffixOptions): JQuery = js.native
  
  def alert(): JQuery = js.native
  def alert(command: String): JQuery = js.native
  
  def button(): JQuery = js.native
  def button(command: String): JQuery = js.native
  
  def carousel(): JQuery = js.native
  def carousel(options: String): JQuery = js.native
  def carousel(options: CarouselOptions): JQuery = js.native
  
  def collapse(): JQuery = js.native
  def collapse(options: String): JQuery = js.native
  def collapse(options: CollapseOptions): JQuery = js.native
  
  // $('#modal').modalTrigger()
  def data(value: String): JQuery = js.native
  // off(events: "dp.change", selector?: string, handler?: (eventobject: DatetimepickerChangeEventObject) => any): JQuery;
  // off(events: "dp.change", handler: (eventobject: DatetimepickerChangeEventObject) => any): JQuery;
  // on(events: "dp.change", selector: string, data: any, handler?: (eventobject: DatetimepickerChangeEventObject) => any): JQuery;
  // on(events: "dp.change", selector: string, handler: (eventobject: DatetimepickerChangeEventObject) => any): JQuery;
  // on(events: 'dp.change', handler: (eventObject: DatetimepickerChangeEventObject) => any): JQuery;
  // off(events: "dp.show", selector?: string, handler?: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // off(events: "dp.show", handler: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: "dp.show", selector: string, data: any, handler?: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: "dp.show", selector: string, handler: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: 'dp.show', handler: (eventObject: DatetimepickerEventObject) => any): JQuery;
  // off(events: "dp.hide", selector?: string, handler?: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // off(events: "dp.hide", handler: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: "dp.hide", selector: string, data: any, handler?: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: "dp.hide", selector: string, handler: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: 'dp.hide', handler: (eventObject: DatetimepickerEventObject) => any): JQuery;
  // off(events: "dp.error", selector?: string, handler?: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // off(events: "dp.error", handler: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: "dp.error", selector: string, data: any, handler?: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: "dp.error", selector: string, handler: (eventobject: DatetimepickerEventObject) => any): JQuery;
  // on(events: 'dp.error', handler: (eventObject: DatetimepickerEventObject) => any): JQuery;
  @JSName("data")
  def data_DateTimePicker(key: DateTimePicker): Datetimepicker = js.native
  @JSName("data")
  def data_ImageCutter(cmd: String): ImageCutter = js.native
  
  def datatable(): JQuery = js.native
  def datatable(command: String, optionOrData: DataTableData): JQuery = js.native
  def datatable(command: String, optionOrData: DataTableOption): JQuery = js.native
  def datatable(option: DataTableOption): JQuery = js.native
  
  def datetimepicker(): JQuery = js.native
  def datetimepicker(options: DatetimepickerOptions): JQuery = js.native
  
  def draggable(option: String): JQuery = js.native
  def draggable(option: DraggableOption): JQuery = js.native
  
  def dropdown(): JQuery = js.native
  def dropdown(command: String): JQuery = js.native
  
  def droppable(option: String): JQuery = js.native
  def droppable(option: DroppableOption): JQuery = js.native
  
  def emulateTransitionEnd(duration: Double): JQuery = js.native
  
  def imgCutter(option: ImageCutterOption): JQuery = js.native
  
  def modal(): JQuery = js.native
  def modal(command: String): JQuery = js.native
  def modal(options: ModalOptions): JQuery = js.native
  def modal(options: ModalOptionsBackdropString): JQuery = js.native
  
  def modalTrigger(): JQuery = js.native
  def modalTrigger(option: ModalTriggerOption): JQuery = js.native
  
  def popover(): JQuery = js.native
  def popover(options: String): JQuery = js.native
  def popover(options: PopoverOptions): JQuery = js.native
  
  def scrollspy(): JQuery = js.native
  def scrollspy(options: String): JQuery = js.native
  def scrollspy(options: ScrollSpyOptions): JQuery = js.native
  
  def selectable(): JQuery = js.native
  def selectable(option: SelectableOption): JQuery = js.native
  
  def sortable(): JQuery = js.native
  def sortable(option: String): JQuery = js.native
  def sortable(option: SortableOption): JQuery = js.native
  
  def tab(): JQuery = js.native
  def tab(command: String): JQuery = js.native
  
  def tooltip(): JQuery = js.native
  def tooltip(command: String): JQuery = js.native
  def tooltip(command: String, params: String): JQuery = js.native
  def tooltip(options: TooltipOptions): JQuery = js.native
  
  def tree(): JQuery = js.native
  def tree(option: TreeMenuOption): JQuery = js.native
  
  def typeahead(): JQuery = js.native
  def typeahead(options: TypeaheadOptions): JQuery = js.native
  
  def uploader(option: UploaderOption): JQuery = js.native
}
