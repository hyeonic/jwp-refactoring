package kitchenpos.application.fixture;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.List;
import kitchenpos.domain.OrderTable;
import kitchenpos.domain.TableGroup;
import kitchenpos.dto.TableGroupSaveRequest;

public class TableGroupFixtures {

    public static final TableGroup generateTableGroup(final List<OrderTable> orderTables) {
        return generateTableGroup(null, LocalDateTime.now(), orderTables);
    }

    public static final TableGroup generateTableGroup(final Long id, final TableGroup tableGroup) {
        return generateTableGroup(id, tableGroup.getCreatedDate(), tableGroup.getOrderTables());
    }

    public static final TableGroup generateTableGroup(final Long id,
                                                      final LocalDateTime createdDate,
                                                      final List<OrderTable> orderTables) {
        try {
            Constructor<TableGroup> constructor = TableGroup.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            TableGroup tableGroup = constructor.newInstance();
            Class<? extends TableGroup> clazz = tableGroup.getClass();

            Field idField = clazz.getDeclaredField("id");
            idField.setAccessible(true);
            idField.set(tableGroup, id);

            Field createdDateField = clazz.getDeclaredField("createdDate");
            createdDateField.setAccessible(true);
            createdDateField.set(tableGroup, createdDate);

            Field orderTablesField = clazz.getDeclaredField("orderTables");
            orderTablesField.setAccessible(true);
            orderTablesField.set(tableGroup, orderTables);

            return new TableGroup(orderTables);
        } catch (final Exception e) {
            throw new RuntimeException();
        }
    }

    public static final TableGroupSaveRequest generateTableGroupSaveRequest(final List<OrderTable> orderTables) {
        return new TableGroupSaveRequest(orderTables);
    }
}
