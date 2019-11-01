package juris.vassa.kalenderhorisontal.utils;

import java.util.Calendar;

import juris.vassa.kalenderhorisontal.HorizontalCalendarView;

/**
 * @author juris vassa
 * @since v1.0.0
 */
public abstract class HorizontalCalendarListener {

    public abstract void onDateSelected(Calendar date, int position);

    public void onCalendarScroll(HorizontalCalendarView calendarView, int dx, int dy) {
    }

    public boolean onDateLongClicked(Calendar date, int position) {
        return false;
    }

}