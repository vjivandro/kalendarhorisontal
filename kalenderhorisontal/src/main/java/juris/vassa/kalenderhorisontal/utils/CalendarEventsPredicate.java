package juris.vassa.kalenderhorisontal.utils;

import java.util.Calendar;
import java.util.List;

import juris.vassa.kalenderhorisontal.model.CalendarEvent;

/**
 * @author juris vassa
 * @since v1.3.2
 */
public interface CalendarEventsPredicate {

    /**
     * @param date the date where the events will be attached to.
     * @return a list of {@link CalendarEvent} related to this date.
     */
    List<CalendarEvent> events(Calendar date);
}
