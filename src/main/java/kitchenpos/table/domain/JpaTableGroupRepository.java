package kitchenpos.table.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTableGroupRepository extends JpaRepository<TableGroup, Long>, TableGroupRepository {
}
